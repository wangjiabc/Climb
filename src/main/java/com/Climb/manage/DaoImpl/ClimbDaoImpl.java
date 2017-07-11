package com.Climb.manage.DaoImpl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.Climb.manage.Dao.ClimbDao;
import com.Climb.manage.Model.assort;

@Repository("climbDaoImpl")
public class ClimbDaoImpl implements ClimbDao{
	@Resource  
    private MongoTemplate mongoTemplate;
	
	@Override
	public <T> List<T> findType(String entityClass) {
		// TODO Auto-generated method stub

		List<T> list = mongoTemplate.getCollection(entityClass)
			    .distinct("type");
		Iterator<T> iterator=list.iterator();
		System.out.println("findtype:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		return list;
	}

	
	@Override
	public <T> List<T> findAll(Class<T> entityClass, Integer pageSize,
			Integer pageNumber,String searchText) {
		// TODO Auto-generated method stub
		if(searchText!=null){
			BasicQuery query=new BasicQuery("{'title':{$regex:'"+searchText+"'}}");
			query.skip(pageSize);
			query.limit(pageNumber);

			return mongoTemplate.find(query,entityClass);
		}else{
			Query query=new Query();
			query.skip(pageSize);
			query.limit(pageNumber);

			List<T> list= mongoTemplate.find(query,entityClass);
			
			/*
			Iterator<T> iterator=list.iterator();
			
			while (iterator.hasNext()) {
				assort a=(assort) iterator.next();
				System.out.println(a.getInsertDate());
			}
			*/
			 return list;
		}
	
	}

	@Override
	public <T> long getCount(Class<T> entityClass,String searchText) {
		// TODO Auto-generated method stub
		if(searchText!=null){
		 BasicQuery query=new BasicQuery("{'title':{$regex:'"+searchText+"'}}");
		 return mongoTemplate.count(query, entityClass);
		}else{
		  Query query=new Query();
		  return mongoTemplate.count(query, entityClass);
		}
	}


}

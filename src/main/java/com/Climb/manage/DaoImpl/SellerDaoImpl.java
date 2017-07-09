package com.Climb.manage.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.Climb.manage.Dao.SellerDao;


@Repository("sellerDaoImpl") 
public class SellerDaoImpl implements SellerDao{
	@Resource  
    private MongoTemplate mongoTemplate;  
	
	@Override
	public <T> T selectByCampusAdmin(String campusAdmin, Class<T> entityClass){
		Query query = Query.query(Criteria.where("campusAdmin").is(campusAdmin));
		List<T> list=new ArrayList<T>();
		list=mongoTemplate.find(query, entityClass);
		if(list.size()!=0){
			return list.get(0);
		}else{
	 	    return null;
		}
	}
	
	@Override
	public <T> List<T> findAll(Class<T> entityClass){
		return mongoTemplate.findAll(entityClass);
	}
}

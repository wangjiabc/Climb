package com.Climb.manage.DaoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.Climb.manage.Dao.ClimbDao;

@Repository("climbDaoImpl")
public class ClimbDaoImpl implements ClimbDao{
	@Resource  
    private MongoTemplate mongoTemplate;
	
	@Override
	public <T> List<T> findAll(Class<T> entityClass) {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(entityClass);
	}

}

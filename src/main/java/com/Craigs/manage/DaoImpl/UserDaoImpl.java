package com.Craigs.manage.DaoImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.Craigs.manage.Dao.UserDao;
import com.Craigs.manage.Model.User;
import com.Craigs.manage.Model.col;

@Repository("userDaoImpl")  
public class UserDaoImpl implements UserDao {  
      
    @Resource  
    private MongoTemplate mongoTemplate;  
  
    @Override  
    public void insert(User object,String collectionName) {  
        mongoTemplate.insert(object, collectionName);  
    }  
  
 
  
  /*  @Override  
    public List<User> findAll(Map<String,Object> params,String collectionName) {  
        List<User> result = mongoTemplate.find(new Query(Criteria.where("age").lt(params.get("maxAge"))), User.class,collectionName);  
        return result;  
    }  
  */
    @Override
	public <T> List<T> findAll(Class<T> entityClass) {
		return mongoTemplate.findAll(entityClass);
	}
    

    @Override  
    public void createCollection(String name) {  
        mongoTemplate.createCollection(name);  
    }  
  


	@Override
	public List<User> findAll(Map<String, Object> params, String collectionName) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public User findOne(Map<String, Object> params, String collectionName) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void update(Map<String, Object> params, String collectionName) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void remove(Map<String, Object> params, String collectionName) {
		// TODO Auto-generated method stub
		
	}  
}
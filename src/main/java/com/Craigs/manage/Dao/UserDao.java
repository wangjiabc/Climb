package com.Craigs.manage.Dao;

import java.util.List;
import java.util.Map;

import com.Craigs.manage.Model.User;
import com.Craigs.manage.Model.col;
import com.Craigs.manage.mapping.MongoBase;

public interface UserDao extends MongoBase<User>{  
	//添加  
    public void insert(User object,String collectionName);    
    //根据条件查找  
    public User findOne(Map<String,Object> params,String collectionName);    
    //查找所有  
 //   public List<User> findAll(Map<String,Object> params,String collectionName); 
    public <T> List<T> findAll(Class<T> entityClass);
    //修改  
    public void update(Map<String,Object> params,String collectionName);   
    //创建集合  
    public void createCollection(String collectionName);  
    //根据条件删除  
    public void remove(Map<String,Object> params,String collectionName); 
}  

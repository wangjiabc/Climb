package com.Climb.manage.Dao;

import java.util.List;

public interface SellerDao {
	
	public <T> List<T> findAll(Class<T> entityClass);
	
	public <T> T selectByCampusAdmin(String campusAdmin, Class<T> entityClass);
	
}

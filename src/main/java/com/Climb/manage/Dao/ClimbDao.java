package com.Climb.manage.Dao;

import java.util.List;

public interface ClimbDao {
	
	public <T> List<T> findType(String entityClass);

	public <T> List<T> findAll(Class<T> entityClass,Integer pagesSize,
			Integer pageNumber,String searchText);
	
	public <T> long getCount(Class<T> entityClass,String searchText);
	
}

package com.Climb.manage.Dao;

import java.util.List;

public interface ClimbDao {

	public <T> List<T> findAll(Class<T> entityClass);
	
}

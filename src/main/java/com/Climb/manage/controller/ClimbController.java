package com.Climb.manage.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Climb.manage.DaoImpl.ClimbDaoImpl;
import com.Climb.manage.Model.assort;

@Controller
@RequestMapping("/climb")
public class ClimbController {
	@Resource
	private ClimbDaoImpl climbDaoImpl;
	
	@RequestMapping("/findAll")
	public @ResponseBody List findAll(){
		Map<String, Object> map = new HashMap<String, Object>();
		Class<assort> entityClass=(Class<assort>) new assort().getClass();
		return climbDaoImpl.findAll(entityClass);
	}
}

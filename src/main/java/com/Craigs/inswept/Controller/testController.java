package com.Craigs.inswept.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Craigs.manage.DaoImpl.UserDaoImpl;
import com.Craigs.manage.Model.assort;
import com.Craigs.manage.Model.col;
import com.Craigs.manage.Model.testuser;

import com.alibaba.fastjson.JSONObject;


@Controller
@RequestMapping("/test")
public class testController {

	@Resource
   private UserDaoImpl userDaoImpl;
	
	@RequestMapping("/get")
	public @ResponseBody List get(){
		Class<assort> entityClass=(Class<assort>) new assort().getClass();
		return userDaoImpl.findAll(entityClass);
	}
	
}
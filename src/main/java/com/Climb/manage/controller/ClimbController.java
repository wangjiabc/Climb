package com.Climb.manage.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Climb.manage.DaoImpl.ClimbDaoImpl;
import com.Climb.manage.Model.assort;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

@Controller
@RequestMapping("/climb")
public class ClimbController {
	@Resource
	private ClimbDaoImpl climbDaoImpl;
	
	@RequestMapping("/findAll")
	public @ResponseBody Map<String, Object> findAll(HttpServletRequest request,
            HttpServletResponse response,String searchText,Integer pageSize, Integer pageNumber){
		System.out.println("searchtext="+searchText+"  pagesize="+pageSize+
				"  puagnumber="+pageNumber);
		Map<String, Object> map = new HashMap<String, Object>();
		Class<assort> entityClass=(Class<assort>) new assort().getClass();
		List<assort> list=climbDaoImpl.findAll(entityClass,pageNumber,pageSize,searchText);
		JSONArray  json=JSONArray.parseArray(JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd"));		
		map.put("rows", json);
		long total=climbDaoImpl.getCount(entityClass,searchText);
		map.put("total", total);
		return map;
	}
	
	@RequestMapping("/getType")
	public @ResponseBody List getType(){
		List list=new ArrayList<>();
		list=climbDaoImpl.findType(new assort().getClass().getSimpleName());
		return list;
	}
}

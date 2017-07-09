package com.Climb.manage.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Climb.manage.DaoImpl.SellerDaoImpl;
import com.Climb.manage.Model.assort;
import com.Climb.manage.Model.col;
import com.Climb.manage.Model.sellers;
import com.Climb.manage.tools.Constants;
import com.Climb.manage.tools.Md5;


@Controller
@RequestMapping("/seller")
public class SellerController {
	@Resource
	private SellerDaoImpl sellerDaoImpl;
	
	
	@RequestMapping("/findAll")
	public @ResponseBody List findAll(){
		Map<String, Object> map = new HashMap<String, Object>();
		//Class<Sellers> entityClass=(Class<Sellers>) new Sellers().getClass();
		//List<Sellers> sellers;
		//sellers = sellerDaoImpl.findAll(entityClass);	
		Class<sellers> entityClass=(Class<sellers>) new sellers().getClass();
		return sellerDaoImpl.findAll(entityClass);
	}
	
	@RequestMapping("/toLogin")
	public @ResponseBody Map<String, Object> toLogin(
			@RequestParam String campusAdmin, @RequestParam String password,
			HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (campusAdmin != null && password != null
				&& !campusAdmin.trim().equals("")
				&& !password.trim().equals("")) {
			Class<sellers> entityClass=(Class<sellers>) new sellers().getClass();
			sellers sellers = sellerDaoImpl.selectByCampusAdmin(campusAdmin, entityClass);
			System.out.println(sellers.getCampusAdmin());
			if (sellers != null) {
				if (sellers.getPassword().equals((password))) {
					map.put(Constants.STATUS, Constants.SUCCESS);
					map.put(Constants.MESSAGE, "登陆成功");
					HttpSession session = request.getSession();
					session.setAttribute("campusAdmin",
							sellers.getCampusAdmin());
				} else {
					map.put(Constants.STATUS, Constants.FAILURE);
					map.put(Constants.MESSAGE, "用户名或者密码错误");
				}
			} else {
				map.put(Constants.STATUS, Constants.FAILURE);
				map.put(Constants.MESSAGE, "用户名或者密码错误");
			}
		}

		return map;
	}
	
	/**
	 * 鏍规嵁鍟嗗id鏌ユ壘鍟嗗鏁版嵁
	 *
	 * */
	
	@RequestMapping("/getSellerById")
	public @ResponseBody Map<String, Object> getSellerById(String campusAdmin)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		Class<sellers> entityClass=(Class<sellers>) new sellers().getClass();
		sellers sellers = sellerDaoImpl.selectByCampusAdmin("1", entityClass);
		map.put("seller",sellers);		
		return map;
	}
	
	@RequestMapping(value="/logout")
	public  String logout(HttpServletRequest request){	
		request.getSession().removeAttribute("campusAdmin");

		return "redirect:/admin/index.html";
	}
	
	@RequestMapping("/checkSellerIsExist")
	public @ResponseBody Map<String, Object> checkSellerIsExist(String campusAdmin)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		Class<sellers> entityClass=(Class<sellers>) new sellers().getClass();
		sellers sellers = sellerDaoImpl.selectByCampusAdmin(campusAdmin, entityClass);
		if(sellers==null)
		{
			map.put(Constants.STATUS, Constants.SUCCESS);
			map.put(Constants.MESSAGE, "用户名或者密码错误");
		}
		else
		{
			map.put(Constants.STATUS, Constants.FAILURE);
			map.put(Constants.MESSAGE, "用户名或者密码错误");			
		}
		
		return map;	
	}
	

}
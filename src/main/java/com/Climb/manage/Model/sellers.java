package com.Climb.manage.Model;

import java.io.Serializable;

public class sellers implements Serializable{	
	private String campusAdmin;
	
	private String password;

	private Integer telePhone;
	
	private String address;
	

	public String getCampusAdmin() {
		return campusAdmin;
	}

	public void setCampusAdmin(String campusAdmin) {
		this.campusAdmin = campusAdmin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();;
	}

	public Integer getTelePhone() {
		return telePhone;
	}

	public void setTelePhone(Integer telePhone) {
		this.telePhone = telePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}


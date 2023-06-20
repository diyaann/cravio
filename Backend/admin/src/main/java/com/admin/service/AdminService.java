package com.admin.service;

import java.awt.Menu;
import java.util.List;

import com.admin.entity.Admin;

public interface AdminService {

	public void saveAdmin(Admin admin);
	public Admin findAdminByEmail(String email);
	
	public Admin findAdminByEmailAndPassword(String email, String password);



}

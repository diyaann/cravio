package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.entity.Admin;
import com.admin.service.AdminServImpl;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class AdminController {
	@Autowired
	private AdminServImpl adminService;

	@PostMapping("/admin/register")
	public String saveAdmin(@RequestBody Admin admin) throws Exception {
		String tempEmail = admin.getAdmin_email();

		if (tempEmail != null && !"".equals(tempEmail)) {
			Admin adminObjectFromDb = adminService.findAdminByEmail(tempEmail);
			if (adminObjectFromDb != null) {
				throw new Exception("Admin with the same email already exist!");
			}
		}
		adminService.saveAdmin(admin);
		return "Hi" + admin.getAdmin_name() + "You have successfully registered";
	}

	@PostMapping("/admin/login")
	public Admin loginAdmin(@RequestBody Admin admin) throws Exception {
		Admin adminFromDb = null;
		String tempAdminEmail = admin.getAdmin_email();
		String tempAdminPassword = admin.getAdmin_password();
		if (tempAdminEmail != null && tempAdminPassword != null) {
			adminFromDb = adminService.findAdminByEmailAndPassword(tempAdminEmail, tempAdminPassword);
		}
		if(adminFromDb == null) {
			throw new Exception("Bad Credentials");
		}
		return adminFromDb;
	}}

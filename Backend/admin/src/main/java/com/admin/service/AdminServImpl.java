package com.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.entity.Admin;
import com.admin.repository.AdminRepo;

@Service
public class AdminServImpl {
	@Autowired
	private AdminRepo adminRepository;

	
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminRepository.save(admin);
	}
	
	
	
	public Admin findAdminByEmail(String email) {
		return adminRepository.findByAdminEmail(email);
	}
	public Admin findAdminByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return adminRepository.findByAdminEmailAndAdminPassword(email, password);
	}
	


}




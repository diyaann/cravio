package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.entity.Admin;


public interface AdminRepo extends JpaRepository<Admin, Integer>{

	Admin findByAdminEmail(String email);
	Admin findByAdminEmailAndAdminPassword(String email,String password);
	

}

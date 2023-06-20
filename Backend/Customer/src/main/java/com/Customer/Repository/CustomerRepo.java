package com.Customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Customer.Entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{

	Customer findByCustomerEmailAndCustomerPassword(String tempCustomerEmail, String tempCustomerPassword);
	Customer findByCustomerEmail(String email);
}

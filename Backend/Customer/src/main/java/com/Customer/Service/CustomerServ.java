package com.Customer.Service;

import java.awt.Menu;
import java.util.List;

import com.Customer.Entity.Customer;

public interface CustomerServ {

	public void registerCustomer(Customer customer);


	public Customer findCustomerByEmailAndPassword(String tempCustomerEmail, String tempCustomerPassword);

	public Customer getCustomerById(int id);

	public Customer getCustomerById(String email);
		
}




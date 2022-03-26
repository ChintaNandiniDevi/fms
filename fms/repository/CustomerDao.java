package com.cap.fms.repository;

import java.util.List;

import com.cap.fms.entities.Customer;

public interface CustomerDao {
	boolean loginCustomer();
	Customer getCustomer();
	boolean addCustomer();
	boolean updateCustomer();
	boolean deleteCustomer();
	List<Customer> getAllCustomers();
	
     
}

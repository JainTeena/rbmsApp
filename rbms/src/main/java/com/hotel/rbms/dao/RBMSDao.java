package com.hotel.rbms.dao;

import java.util.Optional;

import com.hotel.entity.Customer;

public interface RBMSDao {
	
	public void saveCustomerDetails(Customer  customer); 
	public Optional<Customer> getCustomerById(String  id);
}

package com.hotel.rbms.services;

import java.util.Optional;

import com.hotel.entity.Customer;


public interface RBMSService {

	public void saveCustomerDetails(Customer  customer); 
	public Optional<Customer> getCustomerById(String  id); 
	
}

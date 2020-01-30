package com.hotel.rbms.services;

import com.hotel.entity.Customer;


public interface RBMSService {

	public void saveCustomerDetails(Customer  customer); 
	public Customer getCustomerById(String  id); 
	
}

package com.hotel.rbms.dao;

import com.hotel.entity.Customer;

public interface RBMSDao {
	
	public void saveCustomerDetails(Customer  customer); 
	public Customer getCustomerById(String  id);
}

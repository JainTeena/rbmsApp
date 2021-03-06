package com.hotel.rbms.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Customer;
import com.hotel.rbms.dao.RBMSDao;
import com.hotel.rbms.services.RBMSService;

@Service
public class RBMSServiceImpl implements RBMSService{

	@Autowired
	RBMSDao rbmsDao;
	
	@Override
	public Customer getCustomerById(String  id) {
		Customer customer = rbmsDao.getCustomerById(id);
		return customer;
	}

	@Override
	public void saveCustomerDetails(Customer customer) {
		rbmsDao.saveCustomerDetails(customer);
	}

}

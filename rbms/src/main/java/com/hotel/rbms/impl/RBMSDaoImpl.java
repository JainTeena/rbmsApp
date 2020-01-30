package com.hotel.rbms.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Customer;
import com.hotel.rbms.dao.RBMSDao;
import com.hotel.repository.CustomerRepository;

@Service
public class RBMSDaoImpl implements RBMSDao {
	
	  @Autowired
	    private CustomerRepository customerRepository;
	  
public Customer getCustomerById(String  id) {
	System.out.println("--id--"+id);
	Optional<Customer> customer=  customerRepository.findById(id);
	return customer.get();
}

@Override
public void saveCustomerDetails(Customer customer) {
	customerRepository.save(customer);
}
	
}

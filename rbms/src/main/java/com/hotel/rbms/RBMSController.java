package com.hotel.rbms;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.Customer;
import com.hotel.rbms.services.RBMSService;

@RestController
public class RBMSController {
	
	@Autowired
	RBMSService rbmsService;
	
	Logger logger = LoggerFactory.getLogger(RBMSController.class);
	
	@POST
	@RequestMapping("/api/customer/")
	@Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})	
	public void saveCustomerDetails(@RequestBody Customer customer) {
		logger.info(customer.getId()+" CUSTOMER ID  CUSTOMER NAME "+customer.getFirstName());
		 rbmsService.saveCustomerDetails(customer);
	}
	
	@RequestMapping("/api/customer/{id}")
	public String getCustomerById(@PathVariable("id") String  id) {
		Customer custDetails = rbmsService.getCustomerById(id);
		logger.info("GET CUSTOMER NAME--"+custDetails.getFirstName());
		return custDetails.getFirstName();
	}

}

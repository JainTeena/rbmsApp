package com.hotel.rbms;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.Customer;
import com.hotel.rbms.services.RBMSService;

@RestController
public class RBMSController {
	
	@Autowired
	RBMSService rbmsService;
	
	@POST
	@RequestMapping("/api/customer/")
	@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})	
	public void saveCustomerDetails(@PathVariable Customer customer) {
		System.out.println("customer -- "+customer.getFirstName());
		 rbmsService.saveCustomerDetails(customer);
	}
	
	@RequestMapping("/api/customer/{id}")
	public String getCustomerById(@PathVariable("id") String  id) {
		System.out.println("---"+id);
		Customer custDetails = rbmsService.getCustomerById(id);
		System.out.println("----=--9876   "+custDetails.getFirstName());
		return custDetails.getFirstName();
	}

}

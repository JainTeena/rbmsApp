package com.hotel.rbms;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hotel.entity.Customer;
import com.hotel.repository.CustomerRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
class RbmsApplicationTests {
	
	@Autowired
    private CustomerRepository customerRepository;
     
    @Test
    public void whenFindingCustomerById_thenCorrect() {
    	customerRepository.save(new Customer("1", "Ram", "Raja", "16/09/1990", "ram@domain.com", "pass@123"));
    }
    
    @Test
    public void whenFindingAllCustomers_thenCorrect() {
    	customerRepository.save(new Customer("2", "Rakesh", "shukla", "16/09/1990", "rakesh@domain.com", "pass@123"));
    	
    	List<Customer> customer =(List<Customer>) customerRepository.findAll();
    	
    	for (Customer customer2 : customer) {
			System.out.println(customer2.getFirstName());
		}
    	
    	System.out.println(customer.toString()+"-------"+customer.getClass().getName());
    }

	@Test
	void contextLoads() {
	}

}

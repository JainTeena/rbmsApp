package com.hotel.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotel.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {}

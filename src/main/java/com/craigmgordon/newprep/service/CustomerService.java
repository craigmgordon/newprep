package com.craigmgordon.newprep.service;

import java.util.List;

import com.craigmgordon.newprep.model.Customer;

public interface CustomerService {
	public List<Customer> findAll();

	public Customer save(Customer customer);
}

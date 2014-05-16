package com.craigmgordon.newprep.repository;

import java.util.List;

import com.craigmgordon.newprep.model.Customer;

public interface CustomerRepository {

	Customer save(Customer customer);

	List<Customer> loadAll();
}

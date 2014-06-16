package com.craigmgordon.newprep.service;

import java.util.List;

import com.craigmgordon.newprep.model.Customer;
import com.craigmgordon.newprep.model.projection.CustomerOrderReport;

public interface CustomerService {
	public List<Customer> findAll();

	public Customer save(Customer customer);

	public List<CustomerOrderReport> findAllCustomerOrderReports();

}

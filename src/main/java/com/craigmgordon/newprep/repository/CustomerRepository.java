package com.craigmgordon.newprep.repository;

import java.util.List;

import com.craigmgordon.newprep.model.Customer;
import com.craigmgordon.newprep.model.projection.CustomerOrderReport;

public interface CustomerRepository {

	Customer save(Customer customer);

	List<Customer> loadAll();

	List<CustomerOrderReport> findAllCustomerOrderReports();
}

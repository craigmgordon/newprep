package com.craigmgordon.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.craigmgordon.newprep.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	public List<Customer> findAll() {
		// TODO remove temp mock implementation
		List<Customer> customers = new ArrayList<Customer>();

		Customer c1 = new Customer();
		c1.setForeame("Craig");
		c1.setSurname("Gordon");
		c1.setSalary(new BigDecimal(20000l));
		c1.setCustomerRef("CG001");

		Customer c2 = new Customer();
		c2.setForeame("Nicola");
		c2.setSurname("Gordon");
		c2.setSalary(new BigDecimal(19000l));
		c2.setCustomerRef("NG201");

		customers.add(c1);
		customers.add(c2);

		return customers;

	}

}

package com.craigmgordon.newprep.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.craigmgordon.newprep.model.Customer;
import com.craigmgordon.newprep.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

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

	@Transactional
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Customer> loadAll() {
		return customerRepository.loadAll();
	}

}

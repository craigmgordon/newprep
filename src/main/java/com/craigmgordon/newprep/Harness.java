package com.craigmgordon.newprep;

import java.math.BigDecimal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.craigmgordon.newprep.model.Customer;
import com.craigmgordon.service.CustomerService;

public class Harness {

	@Autowired
	CustomerService service;

	final static Log log = LogFactory.getLog(Harness.class);

	public void test() {
		Customer customer = new Customer();
		customer.setCustomerRef("TEST001");
		customer.setForeame("testforename");
		customer.setSurname("testsurname");
		customer.setSalary(new BigDecimal(25000l));

		log.info(customer.toString());
		customer = service.save(customer);
		log.info(customer.toString());

	}
}

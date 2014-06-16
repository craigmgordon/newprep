package com.craigmgordon.newprep.service;

import java.util.List;

import org.hibernate.LazyInitializationException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.craigmgordon.newprep.model.Customer;
import com.craigmgordon.newprep.model.projection.CustomerOrderReport;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application.xml",
		"classpath:jpaContext.xml" })
public class TestCustomerService {

	@Autowired
	private CustomerService customerService;

	@Test
	public void testLoadAll() {
		List<Customer> customers = customerService.findAll();
		Assert.assertTrue(customers.size() > 0);
	}

	@Test(expected = LazyInitializationException.class)
	public void testFetchTypeThrowsLazyInitializationException() {
		List<Customer> customers = customerService.findAll();
		customers.get(0).getOrders().get(0);
	}

	@Ignore
	@Test
	public void testFetchTypeEagerResolvesException() {
		List<Customer> customers = customerService.findAll();
		Assert.assertNotNull(customers.get(0).getOrders().get(0));
	}

	@Test
	public void testFindAllCustomerOrderReports() {
		List<CustomerOrderReport> customerOrderReports = customerService
				.findAllCustomerOrderReports();
		Assert.assertNotNull(customerOrderReports.get(0).getOrderDate());
	}

}

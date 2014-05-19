package com.craigmgordon.newprep.service;

import java.util.List;

import org.hibernate.LazyInitializationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.craigmgordon.newprep.Harness;
import com.craigmgordon.newprep.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application.xml",
		"classpath:jpaContext.xml" })
public class TestCustomerService {

	@Autowired
	private CustomerService customerService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/application.xml");
		Harness harness = (Harness) context.getBean("harness");
		harness.init();
	}

	@Test
	public void testLoadAll() {
		List<Customer> customers = customerService.loadAll();
		Assert.assertTrue(customers.size() > 0);
	}

	@Ignore
	@Test(expected = LazyInitializationException.class)
	public void testFetchTypeThrowsLazyInitializationException() {
		List<Customer> customers = customerService.loadAll();
		customers.get(0).getOrders().get(0);
	}

	@Test
	public void testFetchTypeEagerResolvesException() {
		List<Customer> customers = customerService.loadAll();
		Assert.assertNotNull(customers.get(0).getOrders().get(0));
	}

}

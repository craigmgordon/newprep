package com.craigmgordon.newprep;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.craigmgordon.newprep.model.Customer;
import com.craigmgordon.newprep.model.Order;
import com.craigmgordon.newprep.model.OrderItem;
import com.craigmgordon.newprep.service.CustomerService;
import com.craigmgordon.newprep.service.OrderItemService;
import com.craigmgordon.newprep.service.OrderService;

public class Harness {

	@Autowired
	CustomerService customerService;

	@Autowired
	OrderService orderService;

	@Autowired
	OrderItemService orderItemService;

	final static Log log = LogFactory.getLog(Harness.class);

	public void init() {
		Customer customer = new Customer();
		customer.setCustomerRef("TEST001");
		customer.setForeame("testforename");
		customer.setSurname("testsurname");
		customer.setSalary(new BigDecimal(25000l));

		customer = customerService.save(customer);

		Order order1 = new Order();
		order1.setOrderDate(new Date());
		order1.setOrderStatus("Pending");
		order1.setCustomer(customer);

		Order order2 = new Order();
		order2.setOrderDate(new Date());
		order2.setOrderStatus("Dispatching");
		order2.setCustomer(customer);

		order1 = orderService.save(order1);
		order2 = orderService.save(order2);

		OrderItem orderItem1 = new OrderItem();
		orderItem1.setDescription("iPhone 5s White");
		orderItem1.setPrice(new BigDecimal(550l));
		orderItem1.setOrder(order1);

		OrderItem orderItem2 = new OrderItem();
		orderItem2.setDescription("iPad Mini Retina Black");
		orderItem2.setPrice(new BigDecimal(450l));
		orderItem2.setOrder(order1);

		OrderItem orderItem3 = new OrderItem();
		orderItem3.setDescription("Macbook Pro Retina");
		orderItem3.setPrice(new BigDecimal(1850l));
		orderItem3.setOrder(order2);

		orderItem1 = orderItemService.save(orderItem1);
		orderItem2 = orderItemService.save(orderItem2);
		orderItem3 = orderItemService.save(orderItem3);

		log.info(orderItem3);

	}
}

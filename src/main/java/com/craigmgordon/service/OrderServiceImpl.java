package com.craigmgordon.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.craigmgordon.newprep.model.Order;
import com.craigmgordon.newprep.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public Order save(Order order) {
		return orderRepository.save(order);
	}

}

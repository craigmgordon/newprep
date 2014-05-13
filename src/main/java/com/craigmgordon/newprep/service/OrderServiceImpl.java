package com.craigmgordon.newprep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.craigmgordon.newprep.model.Order;
import com.craigmgordon.newprep.repository.OrderRepository;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Transactional
	public Order save(Order order) {
		return orderRepository.save(order);
	}

}

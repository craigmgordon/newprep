package com.craigmgordon.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.craigmgordon.newprep.model.OrderItem;
import com.craigmgordon.newprep.repository.OrderItemRepository;

public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;

	public OrderItem save(OrderItem orderItem) {
		return orderItemRepository.save(orderItem);
	}

}

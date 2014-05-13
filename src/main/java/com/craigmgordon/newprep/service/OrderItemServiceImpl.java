package com.craigmgordon.newprep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.craigmgordon.newprep.model.OrderItem;
import com.craigmgordon.newprep.repository.OrderItemRepository;

@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Transactional
	public OrderItem save(OrderItem orderItem) {
		return orderItemRepository.save(orderItem);
	}

}

package com.craigmgordon.newprep.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.craigmgordon.newprep.model.OrderItem;

@Repository("orderItemRepository")
public class OrderItemRepositoryImpl implements OrderItemRepository {

	@PersistenceContext
	private EntityManager em;

	public OrderItem save(OrderItem orderItem) {
		em.persist(orderItem);
		em.flush();
		return orderItem;
	}

}

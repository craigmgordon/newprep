package com.craigmgordon.newprep.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.craigmgordon.newprep.model.Order;

public class OrderRepositoryImpl implements OrderRepository {

	@PersistenceContext
	private EntityManager em;

	public Order save(Order order) {
		em.persist(order);
		em.flush();
		return order;
	}

}

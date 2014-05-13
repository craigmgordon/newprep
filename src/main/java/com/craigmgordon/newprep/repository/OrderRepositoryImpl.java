package com.craigmgordon.newprep.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.craigmgordon.newprep.model.Order;

@Repository("orderRepository")
public class OrderRepositoryImpl implements OrderRepository {

	@PersistenceContext
	private EntityManager em;

	public Order save(Order order) {
		em.persist(order);
		em.flush();
		return order;
	}

}

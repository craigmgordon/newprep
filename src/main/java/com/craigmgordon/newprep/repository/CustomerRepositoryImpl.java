package com.craigmgordon.newprep.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.craigmgordon.newprep.model.Customer;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

	@PersistenceContext
	private EntityManager em;

	public Customer save(Customer customer) {
		em.persist(customer);
		em.flush();
		return customer;
	}

}

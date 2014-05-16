package com.craigmgordon.newprep.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Customer> loadAll() {
		Query query = em.createQuery("select c from Customer c");
		List customers = query.getResultList();
		return customers;
	}

}

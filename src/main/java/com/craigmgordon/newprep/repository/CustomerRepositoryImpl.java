package com.craigmgordon.newprep.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.craigmgordon.newprep.model.Customer;
import com.craigmgordon.newprep.model.projection.CustomerOrderReport;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

	@PersistenceContext
	private EntityManager em;

	public Customer save(Customer customer) {
		em.persist(customer);
		em.flush();
		return customer;
	}

	public List<Customer> loadAll() {
		TypedQuery<Customer> query = em.createNamedQuery(
				Customer.FIND_ALL_CUSTOMERS, Customer.class);
		return query.getResultList();
	}

	public List<CustomerOrderReport> findAllCustomerOrderReports() {
		TypedQuery<CustomerOrderReport> query = em
				.createNamedQuery(Customer.FIND_CUSTOMER_ORDER_REPORTS,
						CustomerOrderReport.class);
		return query.getResultList();
	}

}

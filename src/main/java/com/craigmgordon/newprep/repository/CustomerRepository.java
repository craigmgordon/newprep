package com.craigmgordon.newprep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.craigmgordon.newprep.model.Customer;
import com.craigmgordon.newprep.model.projection.CustomerOrderReport;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query("select new com.craigmgordon.newprep.model.projection.CustomerOrderReport(c.customerRef, c.forename, c.surname, o.id, o.orderDate)"
			+ "from Customer c, Order o where c.id = o.customer.id")
	List<CustomerOrderReport> findAllCustomerOrderReports();
}

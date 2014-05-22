package com.craigmgordon.newprep.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.common.base.Objects;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	public static final String FIND_CUSTOMER_ORDER_REPORTS = "findCustomerOrderReports";
	public static final String FIND_ALL_CUSTOMERS = "findAllCustomers";

	@Id
	@GeneratedValue
	private Long id;

	private String forename;
	private String surname;
	private String customerRef;
	private BigDecimal salary;

	@Override
	public String toString() {
		return Objects.toStringHelper(getClass()).add("id", id)
				.add("customerRef", customerRef).add("forename", forename)
				.add("surname", surname).add("salary", salary).toString();
	}

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Order> orders = new ArrayList<Order>();

	public String getForeame() {
		return forename;
	}

	public void setForeame(String foreame) {
		this.forename = foreame;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCustomerRef() {
		return customerRef;
	}

	public void setCustomerRef(String customerRef) {
		this.customerRef = customerRef;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}

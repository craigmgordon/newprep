package com.craigmgordon.newprep.model.projection;

import java.util.Date;

public class CustomerOrderReport {
	/*
	 * Projection does not need to be a JPA entity although it can be Good for
	 * presenting objects to the UI Need a constructor for the projection which
	 * is used by a jpql query Can be more efficient than relying on eager
	 * collections, can use lazy collections and allow jpql to make the join
	 */

	private String customerRef;
	private String forename;
	private String surname;
	private Long orderId;
	private Date orderDate;

	public CustomerOrderReport(String customerRef, String forename,
			String surname, Long orderId, Date orderDate) {
		super();
		this.customerRef = customerRef;
		this.forename = forename;
		this.surname = surname;
		this.orderId = orderId;
		this.orderDate = orderDate;
	}

	public String getCustomerRef() {
		return customerRef;
	}

	public void setCustomerRef(String customerRef) {
		this.customerRef = customerRef;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}

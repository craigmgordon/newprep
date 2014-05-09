package com.craigmgordon.newprep.model;

import java.math.BigDecimal;

public class Customer {
	private String forename;
	private String surname;
	private String customerRef;
	private BigDecimal salary;

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

}

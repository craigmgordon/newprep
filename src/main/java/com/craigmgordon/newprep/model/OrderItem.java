package com.craigmgordon.newprep.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.google.common.base.Objects;

@Entity
@Table(name = "PURCHASE_ORDER_ITEM")
public class OrderItem {

	@Id
	@GeneratedValue
	private Long id;
	private String description;
	private BigDecimal price;

	@ManyToOne
	private Order order;

	@Override
	public String toString() {
		return Objects.toStringHelper(getClass()).add("id", id)
				.add("description", description).add("price", price)
				.add("order", order).toString();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}

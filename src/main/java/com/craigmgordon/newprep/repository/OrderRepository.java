package com.craigmgordon.newprep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.craigmgordon.newprep.model.Order;

@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Long> {

}

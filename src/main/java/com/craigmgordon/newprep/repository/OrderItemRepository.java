package com.craigmgordon.newprep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.craigmgordon.newprep.model.OrderItem;

@Repository("orderItemRepository")
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

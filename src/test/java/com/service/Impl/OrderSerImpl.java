package com.service.Impl;

import com.entity.Order;
import com.service.OrderSer;
import org.springframework.stereotype.Service;

@Service
public class OrderSerImpl implements OrderSer {
	@Override
	public Order creatOrder(Order order) {
		System.out.println("OrderSerImpl+creatOrder");
		return order;
	}

	@Override
	public Order getId(String id) {
		System.out.println("OrderSerImpl+getId");
		Order order = new Order();
		order.setId("12300");
		order.setName("OrderName");
		return order;
	}
}

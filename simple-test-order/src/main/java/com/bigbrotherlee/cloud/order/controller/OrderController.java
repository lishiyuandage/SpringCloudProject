package com.bigbrotherlee.cloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bigbrotherlee.cloud.order.entity.Order;
import com.bigbrotherlee.cloud.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/order/{id}")
	public Order queryOrderById(@PathVariable String id) {
		return orderService.queryOrderById(id);
	}
}

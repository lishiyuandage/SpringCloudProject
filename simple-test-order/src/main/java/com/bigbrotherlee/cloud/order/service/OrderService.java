package com.bigbrotherlee.cloud.order.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigbrotherlee.cloud.order.entity.Item;
import com.bigbrotherlee.cloud.order.entity.Order;
import com.bigbrotherlee.cloud.order.entity.OrderDetail;

@Service
public class OrderService {
	
	@Autowired
	ItemService itemService;
	
	private final static Map<String,Order> MAP=new HashMap<String, Order>();
	
	static {
		Order order=new Order();
		order.setUserId(1L);
		order.setCreateDate(new Date());
		order.setUpdateDate(new Date());
		order.setOrderId(1L);
		
		List<OrderDetail> orderDetails=new ArrayList<OrderDetail>();
		
		Item item=new Item();
		item.setId(1L);
		orderDetails.add(new OrderDetail(item.getId().toString(), item));
		
		item=new Item();
		item.setId(2L);
		orderDetails.add(new OrderDetail(item.getId().toString(), item));
		
		order.setOrderDetails(orderDetails);
		
		MAP.put(order.getOrderId().toString(), order);
	}
	
	public Order queryOrderById(String id) {
		Order order=MAP.get(id);
		
		if(order==null) {
			return null;
		}
		
		List<OrderDetail> orderDetails=order.getOrderDetails();
		
		for(OrderDetail detail:orderDetails) {
			Item item=itemService.queryItemById(detail.getOrderId());
			detail.setItem(item);
		}
		
		return order;
	}
	
}

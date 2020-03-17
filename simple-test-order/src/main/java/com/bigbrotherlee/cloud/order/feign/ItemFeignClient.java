package com.bigbrotherlee.cloud.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bigbrotherlee.cloud.order.entity.Item;

@FeignClient("simple-item")
public interface ItemFeignClient {
	
	@GetMapping("/item/{id}") //借助springmvc注解替代feign的注解
	public Item queryItemById(@PathVariable("id") String id);
}

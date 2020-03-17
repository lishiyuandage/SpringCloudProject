package com.bigbrotherlee.cloud.order.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigbrotherlee.cloud.order.entity.Item;
import com.bigbrotherlee.cloud.order.feign.ItemFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ItemService {
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private ItemFeignClient itemFeignClient;
	
	private static final Logger log = LoggerFactory.getLogger(ItemService.class);

	
//	@Autowired
//	private DiscoveryClient	discoveryClient;
	
	
	@HystrixCommand(fallbackMethod = "queryErrorItemById") //Hystrix容错
	//ribbon负载均衡后，使用feign
	public Item queryItemById(String id) {
		return itemFeignClient.queryItemById(id);
	}
	
//	@HystrixCommand(fallbackMethod = "queryErrorItemById") //Hystrix容错
//	//ribbon负载均衡后,未用feign
//	public Item queryItemById(String id) {
//		String serverId="simple-item";
//		String url="http://"+serverId+"/item/"+id;
//		return restTemplate.getForObject(url, Item.class);
//	}
	//失败调用的方法
	public Item queryErrorItemById(String id) {
		return new Item("查询出错", Long.parseLong(id), null,null);
	}
	//ribbon负载均衡前
//	@Deprecated
//	public Item queryItemById(String id) {
//		List<ServiceInstance> instances=discoveryClient.getInstances("simple-item");
//		ServiceInstance serviceInstance=instances.get(0);
//		String url=serviceInstance.getUri().toString()+"/item/"+id;
//		return restTemplate.getForObject(url, Item.class);
//	}
}

package com.bigbrotherlee.cloud.item.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bigbrotherlee.cloud.item.entity.Item;
import com.bigbrotherlee.cloud.item.entity.JdbcConfigBean;
import com.bigbrotherlee.cloud.item.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private JdbcConfigBean jdbcConfigBean;
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/item/{id}")
	public Item queryItemById(@PathVariable long id) {
		return itemService.queryItemById(id);
	}
	@GetMapping("/jdbcConfigBean")
	public JdbcConfigBean query() {
		return jdbcConfigBean;
	}
}

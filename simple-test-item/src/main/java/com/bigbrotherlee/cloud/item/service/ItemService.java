package com.bigbrotherlee.cloud.item.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bigbrotherlee.cloud.item.entity.Item;

@Service
public class ItemService {
	private static final Map<Long,Item> MAP=new HashMap<Long, Item>();
	
	static {
		MAP.put(1L, new Item("商品名",1L,"商品详情","商品图片"));
		MAP.put(2L, new Item("商品名",2L,"商品详情","商品图片"));
		MAP.put(3L, new Item("商品名",3L,"商品详情","商品图片"));
		MAP.put(4L, new Item("商品名",4L,"商品详情","商品图片"));
		MAP.put(5L, new Item("商品名",5L,"商品详情","商品图片"));
	}
	
	public Item queryItemById(long id) {
		return MAP.get(id);
	}
}

package com.bigbrotherlee.cloud.order.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.bigbrotherlee.cloud.order.App;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(App.class)//为了引入配置
public class RibbonTest {
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@Test
	public void balanceTest() {
		String serverId="simple-item";
		for (int i = 0; i < 100; i++) {
			ServiceInstance serviceInstance=this.loadBalancerClient.choose(serverId);
			System.out.println(i+":--"+serviceInstance.getHost()+":"+serviceInstance.getPort());
			
		}
	}
}

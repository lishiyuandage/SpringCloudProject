package com.bigbrotherlee.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients //feign开启
@EnableHystrix //容错开启
@EnableDiscoveryClient //服务发现开启
@SpringBootApplication
public class App {
	
	@LoadBalanced //客户端访问负载均衡,这里得到的是一个RestTemplate代理类,对其原来的RestTemplate进行了增强
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

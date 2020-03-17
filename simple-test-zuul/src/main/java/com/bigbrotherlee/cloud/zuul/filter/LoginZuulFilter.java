package com.bigbrotherlee.cloud.zuul.filter;

import org.springframework.cloud.netflix.zuul.util.RequestUtils;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

//@Component //注入容器
public class LoginZuulFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return true;//表示需要执行
	}

	@Override
	public Object run() throws ZuulException {//业务逻辑
		
		return null;
	}

	@Override
	public String filterType() {
		return "pre";//表示前置 error 错误 post 后置 .....
	}

	@Override
	public int filterOrder() {
		return 1; //越小越先执行
	}

}

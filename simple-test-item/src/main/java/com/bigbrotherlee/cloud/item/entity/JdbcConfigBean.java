package com.bigbrotherlee.cloud.item.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope //要动态更改的内容
public class JdbcConfigBean{
	
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.name}")
	private String name;
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.url}")
	private String url;
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "JdbcConfigBean [driver=" + driver + ", name=" + name + ", password=" + password + ", url=" + url + "]";
	}
	
}

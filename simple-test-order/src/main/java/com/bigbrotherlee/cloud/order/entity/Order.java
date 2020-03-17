package com.bigbrotherlee.cloud.order.entity;

import java.util.Date;
import java.util.List;

public class Order {
	
	private Long orderId;
	private Long userId;
	private Date createDate;
	private Date updateDate;
	private List<OrderDetail> orderDetails;
	
	
	public Order() {}
	public Order(Long orderId, Long userId, Date createDate, Date updateDate, List<OrderDetail> orderDetails) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.orderDetails = orderDetails;
	}
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", orderDetails=" + orderDetails + "]";
	} 
	
	
}

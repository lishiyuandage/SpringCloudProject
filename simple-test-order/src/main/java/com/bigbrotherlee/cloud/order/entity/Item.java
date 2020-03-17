package com.bigbrotherlee.cloud.order.entity;

public class Item {

	private String name;
	private Long id;
	private String detail;
	private String pic;
	
	public Item() {}
	public Item(String name, Long id, String detail, String pic) {
		super();
		this.name = name;
		this.id = id;
		this.detail = detail;
		this.pic = pic;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", id=" + id + ", detail=" + detail + ", pic=" + pic + "]";
	}
	
}

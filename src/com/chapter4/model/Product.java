package com.chapter4.model;

import java.util.Date;

public class Product {
	private long id;
	private String name;
	private String description;
	private float price;
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		String tmp = "id:" + id + "\n";
		tmp += "name:"+ name + "\n";
		tmp += "description:"+ description + "\n";
		tmp += "price:" + price + "\n";
		
		return tmp;
	}
}

package com.sportyshoes1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	
	private String name;
	
	private String description;
	
	private  long price;
	
	private String size;
	
	private String color;
	
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public product(String name, String description, long price, String size, String color) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.size = size;
		this.color = color;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "product [pid=" + pid + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", size=" + size + ", color=" + color + "]";
	}
}

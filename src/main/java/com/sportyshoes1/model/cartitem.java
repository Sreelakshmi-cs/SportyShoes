package com.sportyshoes1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartitem")
public class cartitem {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int cartid;
	
	
	private int productid;
	
	
	private int quantity;
	
	private int price;

	
	public cartitem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "cartitem [cartid=" + cartid + ", productid=" + productid + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}	
}

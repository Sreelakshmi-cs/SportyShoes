package com.sportyshoes1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class purchase {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int purid;

	private String cardnum;
	
	private int amount;
	
	private int cartid;
	
	private int cid;

	
	public purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public purchase(String cardnum, int amount, int cartid, int cid) {
		super();
		this.cardnum = cardnum;
		this.amount = amount;
		
		this.cartid = cartid;
		this.cid = cid;
	}

	public int getPurid() {
		return purid;
	}

	public void setPurid(int purid) {
		this.purid = purid;
	}

	public String getCardnum() {
		return cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "purchase [purid=" + purid + ", cardnum=" + cardnum + ", amount=" + amount + ", cartid=" + cartid
				+ ", cid=" + cid + "]";
	}

	
	
	
	
}

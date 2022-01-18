package com.sportyshoes1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	
	private String fname;
	
	private String lname;
	
	private String gender;
	
	private long   phone;
	
	private String email;
	
	private String username;
	private String password;
	
	
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public customer(String fname, String lname, String gender, long phone, String email,String username, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.username= username;
		this.password = password;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", phone="
				+ phone + ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}
	
		

}

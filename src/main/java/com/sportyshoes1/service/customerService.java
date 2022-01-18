package com.sportyshoes1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes1.model.admin;
import com.sportyshoes1.model.customer;
import com.sportyshoes1.repository.CustomerRepo;

@Service
public class customerService {
	
	@Autowired
	CustomerRepo Crepo;
	
	//Save the customer
	public void saveCustomer(customer cm)
	{
		Crepo.save(cm);	
	}
	
	//get all the list of customer
	public List<customer>getAllCustomers()
	{
		return Crepo.findAll();	
	}

	//Check the Customerlogin
	
	public boolean customerCheck(String username, String password) {
		
		customer cm=Crepo.findByUsername(username);
		if(cm.getUsername().equals(username)&&cm.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}
	

}

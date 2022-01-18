package com.sportyshoes1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes1.model.admin;
import com.sportyshoes1.model.customer;
import com.sportyshoes1.model.product;
import com.sportyshoes1.repository.AdminRepo;
import com.sportyshoes1.repository.CustomerRepo;

@Service
public class adminService {
	
	@Autowired
	private AdminRepo Arepo;
	
	
	public boolean adminCheck(String username,String password)
	{
		admin ad=Arepo.findByUsername(username);
		if(ad.getUsername().equals(username)&&ad.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}
	
	
	public admin getAdmin(String username) {
		return Arepo.findByUsername(username);
	}

	public void Passwordchange(admin ad)
	{
		Arepo.save(ad);
	}
	
	
}

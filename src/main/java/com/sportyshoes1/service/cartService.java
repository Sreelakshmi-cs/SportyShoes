package com.sportyshoes1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes1.model.cartitem;
import com.sportyshoes1.repository.CartRepo;

@Service
public class cartService {
	
	@Autowired
	CartRepo cartR;
	
	public List<cartitem> getAllCarts()
	{
		return cartR.findAll();
	}

}

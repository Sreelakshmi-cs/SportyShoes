package com.sportyshoes1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes1.model.purchase;
import com.sportyshoes1.repository.PurchaseRepo;

@Service
public class purchaseService {
	
	@Autowired
	PurchaseRepo Purrepo;
	
	
	public List<purchase>getAllPurchases()
	{
		return Purrepo.findAll();	
	}

}

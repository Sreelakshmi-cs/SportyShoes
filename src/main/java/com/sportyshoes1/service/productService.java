package com.sportyshoes1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes1.model.product;
import com.sportyshoes1.repository.ProductRepo;

@Service
public class productService {
	
	@Autowired
	ProductRepo Prepo;
	
	//Method to List all Products
	public List<product>getAllProducts()
	{
		return Prepo.findAll();
		
	}
	
	//Method to save product
	public void saveProduct(product pd)
	{
		Prepo.save(pd);
	}
	
	
	//Method to delete ProductbyId
	public void deleteProduct(int id)
	{
		Prepo.deleteById(id);
	}
	

}

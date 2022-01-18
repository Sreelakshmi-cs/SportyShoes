package com.sportyshoes1.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sportyshoes1.model.product;
import com.sportyshoes1.service.productService;

@Controller
public class productController {
	
	@Autowired
	productService pService;
	
	@GetMapping("/manageProducts")
	public String manageProduct(Model model)
	{
		model.addAttribute("products",pService.getAllProducts());
		product pd=new product();
		model.addAttribute("product",pd);
		
		return "Manageproduct";
		
	}
	
	@GetMapping("/AddProduct")
	public String newProduct(Model model)
	{
		product pd=new product();
		model.addAttribute("product",pd);
		return "Addproduct";
	}
	
	
	@PostMapping("/newproduct")
	public String addproduct(@ModelAttribute("product")product pd,Model model,HttpSession session)
	{
		
		pService.saveProduct(pd);
		session.setAttribute("action","Product Added Successfully");
		model.addAttribute("product", pd);
		return "manageproduct";
		
	}

	@PostMapping("/products")
	private int saveProduct(@RequestBody product pd)
	{
		pService.saveProduct(pd);
		return pd.getPid();	
	}
	
	
	//This method deleteProduct 
	@DeleteMapping("/products/{id}")
	private void  deleteProduct(@PathVariable("id")int id)
	{
		pService.deleteProduct(id);
	}

}

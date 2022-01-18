package com.sportyshoes1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportyshoes1.model.customer;
import com.sportyshoes1.model.product;
import com.sportyshoes1.service.customerService;
import com.sportyshoes1.service.productService;

@Controller
public class customerController {
	
	@Autowired
	customerService cService;
	
	@Autowired 
	productService pService;
	
	
	@PostMapping("/addCustomer")
	public String addcustomer(@ModelAttribute("customer")customer cm,Model model,HttpSession session)
	{
		
		cService.saveCustomer(cm);
		session.setAttribute("action","Profile Added Successfully");
		model.addAttribute("customer", cm);
		return "login2";
		
	}
	//verify Customer
	@PostMapping("/checkcustomer")
	public String Checkcust(@RequestParam(name="username")String username,@RequestParam(name="password")String password,Model model)
	{
		if(cService.customerCheck(username, password))
		{
		return "Customerhome";
		}
		else
		{
			model.addAttribute("action","Invalid Credentials");
			return"login2";
		}
	}
	
	@GetMapping("/Customerhome")
	public String Chome() 
	{
		return "Customerhome";
		
	}
	
	@GetMapping("/seeProducts")
	public String seeProduct(Model model)
	{
		model.addAttribute("products",pService.getAllProducts());
		product pd=new product();
		model.addAttribute("product",pd);
		return "Viewproducts";
		
	}
	
	
	//Customer LogOut
		@GetMapping("/clogout")
		public String logout() 
		{
			return "login2";
			
		}
}

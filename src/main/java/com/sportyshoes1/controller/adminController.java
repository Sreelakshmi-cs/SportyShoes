package com.sportyshoes1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportyshoes1.model.admin;
import com.sportyshoes1.model.customer;
import com.sportyshoes1.model.purchase;
import com.sportyshoes1.service.adminService;
import com.sportyshoes1.service.customerService;
import com.sportyshoes1.service.purchaseService;

@Controller
public class adminController {
	
	@Autowired
	private adminService aService;
	
	@Autowired 
	private customerService cService;
	
	@Autowired
	private purchaseService purService;
	
	@RequestMapping(value="/login1", method=RequestMethod.GET)
	public String greetadmin()
	{
		return "login1";
	}
	

	@PostMapping("/checkuser")
	public String loginCheck(@RequestParam(name="username")String username,@RequestParam(name="password")String password,Model model)
	{
		if(aService.adminCheck(username, password))
		{
		return "Adminhome";
		}
		else
		{
			model.addAttribute("action","Invalid Credentials");
			return"login1";
		}
	}
	
	@GetMapping("/changepassword")
	public String Changepass(Model model,HttpSession session)
	{
		String adminname=(String) session.getAttribute("adminname");
		admin ad=aService.getAdmin(adminname);
		model.addAttribute("admin", ad);
		
		return"Changepassword";
	}
	
	@GetMapping("/customerlist")
	public String Customerlist(Model model)
	{
		model.addAttribute("customers",cService.getAllCustomers());
		customer cm=new customer();
		model.addAttribute("customer",cm);
		
		return "Customerlist";
	}
	
	//Get the List of all Purchases
	@GetMapping("/managepurchase")
	public String PurchaseList(Model model)
	{
		model.addAttribute("purchases",purService.getAllPurchases());
		purchase pc=new purchase();
		model.addAttribute("purchase",pc);
		return "Viewpurchase";
		
	}
	
	//Admin LogOut
	@GetMapping("/logout")
	public String logout() 
	{
		return "login1";
		
	}
}

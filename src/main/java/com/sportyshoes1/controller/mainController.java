package com.sportyshoes1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportyshoes1.model.admin;
import com.sportyshoes1.model.cartitem;
import com.sportyshoes1.model.customer;
import com.sportyshoes1.service.adminService;
import com.sportyshoes1.service.cartService;

@Controller
public class mainController {
	
	@Autowired
	adminService aService;
	
	@Autowired 
	cartService ctService;
	
	@RequestMapping(value="/login2", method=RequestMethod.GET)
	public String Customerhome()
	{
		return "login2";
	}
	
	@GetMapping("/adminhome")
	public String Adminhome() 
	{
		return "Adminhome";
		
	}
	
	@GetMapping("/register")
	public String Register(Model model)
	{
		customer cs=new customer();
		model.addAttribute("customer",cs);
		return "register";
	}

	//Change admin password
	@PostMapping("/adminpassword")
	public String Adminpassword(@RequestParam(name="username")String username,@RequestParam(name="oldpassword")String oldpassword,@RequestParam(name="newpassword")String newpassword,Model model)
	{
		admin ad=aService.getAdmin(username);
		if(oldpassword.equals(ad.getPassword()))
		{
			ad.setPassword(newpassword);
			aService.Passwordchange(ad);
			model.addAttribute("action","Password Updated");
			return "Adminhome";
		}
		else
		{
			model.addAttribute("action","Incorrect Password or Username");
			return "Changepassword";
		}
		
	}
	
	@GetMapping("/visitcart")
	public String Visitcart(Model model)
	{
		
		model.addAttribute("carts",ctService.getAllCarts());
		cartitem ct=new cartitem();
		model.addAttribute("cartitem",ct);
		return "Viewcart";
		
	}
	
	

}

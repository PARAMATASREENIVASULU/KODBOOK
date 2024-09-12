package com.athentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.athentication.entities.User;
import com.athentication.service.UserServices;

@Controller
public class UserControllers {

	@Autowired
	UserServices service;
	
	@PostMapping("/signup")
	public String addUser(@ModelAttribute User user)
	{
		//check is username already exist
		boolean status = service.usernameExists(user.getUsername());
		
		//username does not exist
		if(status==false)
		{
			service.addUser(user);
		}
		else{
			System.out.println("Username aready exists");
		}
		return "login";
	}
	@PostMapping("login")
	public String validateUser(@RequestParam String username,
			@RequestParam String password)
	{
		System.out.println(username+" "+password);
		boolean status = service.validateUser(username, password);
		System.out.println(status);
		  
		  if(status==true)
		  {
			  return "home";
		  }
		
		return "login";
		 
	}
}

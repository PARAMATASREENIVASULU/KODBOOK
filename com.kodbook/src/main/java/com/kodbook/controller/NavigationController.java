
package com.kodbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/openSignup")
	public String openSignup()
	{
		return "signUp";
	}
	
	@GetMapping("/openResetPassword")
	public String openResetPassword()
	{
		return "resetPassword";
	}
	
	@GetMapping("/createPost")
	public String createPost()
	{
		return "createPost";
	}
	
	
	
	
}

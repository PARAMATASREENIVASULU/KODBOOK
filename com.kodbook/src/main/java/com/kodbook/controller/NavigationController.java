
package com.kodbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kodbook.entities.Post;
import com.kodbook.services.PostService;

@Controller
public class NavigationController {

	@Autowired
	PostService postService;
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/openSignUp")
	public String openSignUp() {
		return "signUp";
	}
	@GetMapping("/openCreatePost")
	public String openCreatePost() {
		return "createPost";
	}
	/*
	@GetMapping("openResetPassword")
	public String openResetPassword() {
		return "resetPassword";
	}
	*/
	@GetMapping("/home")
	public String login(Model model)	{
			List<Post> allPosts = postService.fetchAllPosts();
			model.addAttribute("allPosts", allPosts);
			return "home";
	}
	@GetMapping("/openProfile")
	public String openProfile() {
		return "profile";
	}
	
	@GetMapping("/openEditProfile")
	public String openEditProfile() {
		return "editProfile";
	}
	
}

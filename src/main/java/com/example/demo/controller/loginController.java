package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class loginController {

	
	@GetMapping("/loginUser")
	public String loginUser() {

		
		
		return "loginUser";
	}
	
	@GetMapping("/loginAdmin")
	public String loginAdmin() {

		
		
		return "loginAdmin";
	}
	

	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	
}

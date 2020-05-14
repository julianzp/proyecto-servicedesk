package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

	@GetMapping("/")
	public String main() {
		return "principal";
	}
	
	@GetMapping("/loginUser")
	public String loginUser() {
		return "loginUser";
	}
	
	@GetMapping("/loginAdmin")
	public String loginAdmin() {

		
		
		return "loginAdmin";
	}
	
	@GetMapping("/logout")
	public String logout() {

		
		
		return "redirect:/loginUser";
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

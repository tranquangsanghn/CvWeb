package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Home")
public class Home {
	
	@GetMapping
	public String setHome() {
		System.out.println("Chạy vào Home");
		return "Home";
	}
	

	
}

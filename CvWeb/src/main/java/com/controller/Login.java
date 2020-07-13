package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Model.User;

@Controller
@RequestMapping("/")
public class Login {

	@GetMapping
	public String setHome() {
		return "Login";
	}

	@PostMapping
	public String checkUser(@ModelAttribute User user) {
		if (user.getUserName().equalsIgnoreCase("Admin") && user.getPassword().equalsIgnoreCase("1234")) {
			return "redirect:/Home";
		} else {
			return "Login";
		}
	}
}

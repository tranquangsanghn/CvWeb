package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Model.User;

@Controller
@RequestMapping("/")
public class Login {

	@GetMapping
	@Transactional
	public String setHome() {
		
		String sql = "FROM user";
		try {
			Session session = sessionFactory.getCurrentSession();
			List<User> list = session.createQuery(sql).getResultList();
			for (User user : list) {
				//System.out.println(user.getUserName() + user.getPassword());
			}
		} catch (JDBCConnectionException e) {
			// TODO: handle exception
		}
		
		
		
		return "Login";
	}
	
	@Autowired
	SessionFactory sessionFactory;

	@PostMapping
	public String checkUser(@ModelAttribute User user) {
		if (user.getUserName().equalsIgnoreCase("Admin") && user.getPassword().equalsIgnoreCase("1234")) {
			return "redirect:/Home";
		} else {
			return "Login";
		}
	}

}

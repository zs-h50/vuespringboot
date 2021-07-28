package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/logins")
	public User Login(User user) {
		User user2 = userService.getUserLogin(user);
		if (user2 != null) {
			System.out.println(user2.getAccount());
			System.out.println(user2.getPassword());
			System.out.println(user2.getIdentity());
		}else {
			System.out.println("查询失败!");
		}
		return user2;
	}
}

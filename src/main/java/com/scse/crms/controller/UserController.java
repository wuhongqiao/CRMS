package com.scse.crms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scse.crms.po.User;
import com.scse.crms.service.UserService;

public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.do")
	public String login(User user, HttpSession session){
		User login = userService.login(user);
		if(login != null) {
			session.setAttribute("user", login);
		}
		return "success";
	}
}

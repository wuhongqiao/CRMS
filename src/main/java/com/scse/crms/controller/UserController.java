package com.scse.crms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scse.crms.po.User;
import com.scse.crms.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.do")
	@ResponseBody
	public String login(User user, HttpSession session){
		User login = userService.login(user);
		if(login != null) {
			login.setPassword("");
			session.setAttribute("user", login);
			return "success";
		}
		return "fail";
	}
}

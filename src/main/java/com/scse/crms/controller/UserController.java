package com.scse.crms.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.scse.crms.po.User;
import com.scse.crms.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login.do", produces="text/html;charset=UTF-8")
	@ResponseBody
	public String login(User user, HttpSession session) throws JsonGenerationException, JsonMappingException, IOException{
		User login = userService.login(user);
		if(login != null) {
			login.setPassword("");
			session.setAttribute("user", login);
			return new ObjectMapper().writeValueAsString(login);
		}
		return "fail";
	}
	
	
	@RequestMapping(value="/signOut.do", produces="text/html;charset=UTF-8")
	@ResponseBody
	public String signOut(User user, HttpSession session) throws JsonGenerationException, JsonMappingException, IOException{
		session.setAttribute("user", null);
				
		return "success";
	}
}

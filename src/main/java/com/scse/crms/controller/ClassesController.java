package com.scse.crms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scse.crms.service.ClassesService;

@Controller
public class ClassesController {
	@Autowired
	ClassesService service;
	
	@RequestMapping("class.do")
	@ResponseBody
	public String selectSchedule() {
		//service.selectSchedule();
		
		return service.selectSchedule().toString();
	}
}

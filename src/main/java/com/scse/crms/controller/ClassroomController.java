package com.scse.crms.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scse.crms.service.ClassroomService;

@Controller
public class ClassroomController {
	@Autowired
	ClassroomService classroomService;
	
	@RequestMapping(value="/class.do", produces="text/html;charset=UTF-8")
	@ResponseBody
	public String selectSchedule(String classid) throws JsonGenerationException, JsonMappingException, IOException {
		//service.selectSchedule();
		
		return new ObjectMapper().writeValueAsString(classroomService.selectClassroom(classid));
	}

}

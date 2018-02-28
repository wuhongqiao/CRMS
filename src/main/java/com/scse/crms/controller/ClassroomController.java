package com.scse.crms.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scse.crms.service.ClassroomService;

public class ClassroomController {
	@Autowired
	ClassroomService classroomService;
	
	@RequestMapping("class.do")
	@ResponseBody
	public String selectSchedule(String crid) throws JsonGenerationException, JsonMappingException, IOException {
		//service.selectSchedule();
		
		return new ObjectMapper().writeValueAsString(classroomService.selectClassroom(crid));
	}

}

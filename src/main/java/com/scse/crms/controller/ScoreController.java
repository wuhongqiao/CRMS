package com.scse.crms.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scse.crms.po.User;
import com.scse.crms.service.ScoreService;
import com.scse.crms.vo.ParaForScore;

@Controller
public class ScoreController {
	@Autowired
	public ScoreService scoreService;
	
	@RequestMapping("/{role}/score.do")
	@ResponseBody
	public String selectScore(ParaForScore para, @PathVariable("role") String role, HttpSession session) throws JsonGenerationException, JsonMappingException, IOException {
		if(!role.equals("teacher"))
			para.setSid(((User)session.getAttribute("user")).getId());
		
		return new ObjectMapper().writeValueAsString(scoreService.selectScoreWithClassid(para));
	}
}

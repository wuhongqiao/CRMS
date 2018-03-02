package com.scse.crms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scse.crms.po.User;
import com.scse.crms.service.ClassesService;
import com.scse.crms.vo.SeatTable;

@Controller
public class ClassesController {
	
	@Autowired
	ClassesService classesService;
	
	@RequestMapping("class.do")
	@ResponseBody
	public String selectSchedule() {
		try {
			return new ObjectMapper().writeValueAsString(classesService.selectSchedule());
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "error";
	}

	@RequestMapping("seat.do")
	@ResponseBody
	public String selectSeatTable() {
		return classesService.selectSchedule().toString();
	}

	@RequestMapping("updateSeat.do")
	@ResponseBody
	public String updateSeatTable(SeatTable seatTable, HttpSession session) {
		if(classesService.selectCountWithSeat(seatTable.getSeat())>0) {
			if(((User)session.getAttribute("user")).getRole().equals("学生"))
				return "该座位已被占据";
			if(classesService.removeSeat(seatTable.getSeat())<1)
				return "更换座位失败";
		}
		if(classesService.updateSeat(seatTable)>0)
			return "设置座位成功";
		return "设置座位失败";
	}
}

package com.scse.crms.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import com.scse.crms.service.ClassesService;
import com.scse.crms.vo.ClassesVo;
import com.scse.crms.vo.SeatTable;

@Controller
public class ClassesController {
	
	@Autowired
	ClassesService classesService;
	
	@RequestMapping("/student/schedule.do")
	@ResponseBody
	public String selectScheduleForStudent(HttpSession session, ClassesVo classesVo) {
		try {
			classesVo.setSid(((User)session.getAttribute("user")).getId());
			return new ObjectMapper().writeValueAsString(classesService.selectScheduleForStudent(classesVo));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "error";
	}
	@RequestMapping("/teacher/schedule.do")
	@ResponseBody
	public String selectScheduleForTeacher(HttpSession session, ClassesVo classesVo) {
		try {
			classesVo.setTid(((User)session.getAttribute("user")).getId());
			return new ObjectMapper().writeValueAsString(classesService.selectScheduleForTeacher(classesVo));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "error";
	}
	@RequestMapping("/courseList.do")
	@ResponseBody
	public String courseList(HttpSession session, ClassesVo classesVo) throws JsonGenerationException, JsonMappingException, IOException {
		classesVo.setTid(((User)session.getAttribute("user")).getId());
		List<ClassesVo> schedule = classesService.selectScheduleForTeacher(classesVo);
		Map m = new HashMap();
		List l = new ArrayList<Map>();
		for(ClassesVo c : schedule) {
			if(!m.containsKey(c.getCname()))
				m.put(c.getCname(), new ArrayList<String>());
			((List)m.get(c.getCname())).add(c.getClassid());
		}
		Map json = new HashMap();
		Map clist = new HashMap();
		for(String s : (Set<String>)m.keySet()) {
			json.put("cname", s);
			json.put("clist", new ArrayList<Map>());
			for(String classid : (List<String>)m.get(s)) {
				clist.put("cname", classid);
				((List<Map>)json.get("clist")).add(clist);
			}
			l.add(json);
		}
		
		return new ObjectMapper().writeValueAsString(l);
	}

	@RequestMapping("seat.do")
	@ResponseBody
	public String selectSeatTable(String classid) throws JsonGenerationException, JsonMappingException, IOException {
		return new ObjectMapper().writeValueAsString(classesService.selectSeat(classid));
	}

	@RequestMapping("/{role}/updateSeat.do")
	@ResponseBody
	public String updateSeatTable(@PathVariable("role") String role, SeatTable seatTable, HttpSession session) {
		if(!role.equals("teacher")) {
			if(classesService.selectCountWithSeat(seatTable)>0)
				return "该座位已被占据";
			seatTable.setSid(((User)session.getAttribute("user")).getId());
		}
		else if(classesService.selectCountWithSeat(seatTable)>0) {
			if(classesService.removeSeat(seatTable)<1)
				return "设置座位失败";
		}
		if(classesService.updateSeat(seatTable)>0)
			return "设置座位成功";
		return "设置座位失败";
	}


	@RequestMapping("/student/removeSeat.do")
	@ResponseBody
	public String removeSeatBySid(SeatTable seatTable, HttpSession session) {
		seatTable.setSid(((User)session.getAttribute("user")).getId());
		if(classesService.removeSeatBySid(seatTable)>0)
			return "移除座位成功";
		return "移除座位失败";
	}
	@RequestMapping("/teacher/removeSeat.do")
	@ResponseBody
	public String removeSeat(SeatTable seatTable, HttpSession session) {
		
		if(classesService.removeSeat(seatTable)>0)
			return "移除座位成功";
		return "移除座位失败";
	}
	
	//清空所有座位
	@RequestMapping("/teacher/removeAllSeat.do")
	@ResponseBody
	public String removeAllSeat() {
		if(classesService.removeAllSeat()>0)
			return "清空座位成功";
		return "清空座位失败";
	}

	@RequestMapping("autoRankSeat.do")
	@ResponseBody
	public String autoRankSeat() {
		return "";
	}
}

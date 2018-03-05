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

import com.scse.crms.po.Notice;
import com.scse.crms.po.User;
import com.scse.crms.service.NoticeService;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeService;

	@RequestMapping("/student/notice.do")
	@ResponseBody
	public String selectNoticeForClasses(HttpSession session) throws JsonGenerationException, JsonMappingException, IOException{
		return new ObjectMapper().writeValueAsString(noticeService.selectNoticeForClasses(noticeService.selectClassesBySid(((User)session.getAttribute("user")).getId())));
	}
	@RequestMapping("/teacher/notice.do")
	@ResponseBody
	public String selectNoticeForTeacher(HttpSession session) throws JsonGenerationException, JsonMappingException, IOException{

		//List<Notice> data = noticeService.selectNoticeForTeacher(((User)session.getAttribute("user")).getId());
		
		return new ObjectMapper().writeValueAsString(noticeService.selectNoticeForTeacher(((User)session.getAttribute("user")).getId()));
		//return "{data:"+new ObjectMapper().writeValueAsString(data)+",count:"+data.size()+"}";
	}

	@RequestMapping("/teacher/addNotice.do")
	@ResponseBody
	public String addNotice(Notice notice) {
		// TODO Auto-generated method stub
		return ""+noticeService.addNotice(notice);
	}

	@RequestMapping("/teacher/deleteNoticeById.do")
	@ResponseBody
	public String deleteNoticeById(String id) {
		// TODO Auto-generated method stub
		return ""+noticeService.deleteNoticeById(id);
	}
}

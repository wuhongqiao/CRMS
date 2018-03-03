package com.scse.crms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scse.crms.mapper.NoticeMapper;
import com.scse.crms.po.Notice;
import com.scse.crms.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper noticeMapper;

	public List<Notice> selectNoticeForClasses(List<Notice> list) {
		// TODO Auto-generated method stub
		return noticeMapper.selectNoticeForClasses(list);
	}

	public List<Notice> selectNoticeForTeacher(String tid) {
		// TODO Auto-generated method stub
		return noticeMapper.selectNoticeForTeacher(tid);
	}

	public List<Notice> selectClassesBySid(String sid) {
		// TODO Auto-generated method stub
		return noticeMapper.selectClassesBySid(sid);
	}

	public int addNotice(Notice notice) {
		// TODO Auto-generated method stub
		return noticeMapper.addNotice(notice);
	}

	public int deleteNoticeById(String id) {
		// TODO Auto-generated method stub
		return noticeMapper.deleteNoticeById(id);
	}

}

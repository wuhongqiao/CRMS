package com.scse.crms.service;

import java.util.List;

import com.scse.crms.po.Notice;

public interface NoticeService {
	public List<Notice> selectNoticeForClasses(List<Notice> list);
	public List<Notice> selectNoticeForTeacher(String tid);
	public List<Notice> selectClassesBySid(String sid);
	public int addNotice(Notice notice);
	public int deleteNoticeById(String id);
}

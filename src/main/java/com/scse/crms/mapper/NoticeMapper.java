package com.scse.crms.mapper;

import java.util.List;

import com.scse.crms.po.Notice;

public interface NoticeMapper {
	public List<Notice> selectNoticeForClasses(List<Notice> list);
	public List<Notice> selectNoticeForTeacher(String tid);
	public List<Notice> selectClassesBySid(String sid);
	public int addNotice(Notice notice);
	public int deleteNoticeById(String id);
}

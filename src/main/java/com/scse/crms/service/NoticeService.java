package com.scse.crms.service;

import java.util.List;

import com.scse.crms.po.Notice;
import com.scse.crms.vo.NoticeVo;

public interface NoticeService {
	public List<NoticeVo> selectNoticeForClasses(List<Notice> list);
	public List<NoticeVo> selectNoticeForTeacher(String tid);
	public List<Notice> selectClassesBySid(String sid);
	public int addNotice(Notice notice);
	public int deleteNoticeById(String id);
}

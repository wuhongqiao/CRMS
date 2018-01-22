package com.scse.crms.service;

import java.util.List;

import com.scse.crms.po.Teacher;

public interface TeacherService {
	
	//学生查询
	public List<Teacher> findTeacherBy(Teacher teacher);
	//学生注册
	public void insertTeacher(Teacher teacher);
}

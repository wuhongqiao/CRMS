package com.scse.crms.mapper;

import java.util.List;

import com.scse.crms.po.Teacher;

public interface TeacherMapper {

	//学生查询
	public List<Teacher> findTeacherBy(Teacher teacher);
	//学生注册
	public void insertTeacher(Teacher teacher);
	//删除
	public int deleteTeacherById(String id);
	//修改
	public int updateTeacher(Teacher teacher);
	
}

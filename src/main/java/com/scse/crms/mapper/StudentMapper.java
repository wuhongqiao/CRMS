package com.scse.crms.mapper;

import com.scse.crms.po.Student;
import com.scse.crms.po.StudentVo;

public interface StudentMapper {
	//学生查询
	public Student findStudentById(StudentVo studentVo);
	//学生注册
	public void insertStudent(StudentVo studentVo);
	
}

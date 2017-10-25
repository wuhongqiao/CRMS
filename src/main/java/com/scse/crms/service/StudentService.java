package com.scse.crms.service;

import com.scse.crms.po.Student;
import com.scse.crms.po.StudentVo;

public interface StudentService {
	
	//学生查询
	public Student findStudentById(StudentVo studentVo);
	//学生注册
	public void insertStudent(StudentVo studentVo);
}

package com.scse.crms.service;

import java.util.List;

import com.scse.crms.po.Student;
import com.scse.crms.po.StudentVo;

public interface StudentService {
	
	//学生查询
	public Student findStudentById(Student student);
	public List<Student> findStudentBy(Student student);
	//学生注册
	public void insertStudent(Student student);
}

package com.scse.crms.vo;

import com.scse.crms.po.Student;

//学生的vo也是很有问题，不应该这么写的
//学生包装对象
public class StudentVo {
	
	//学生信息
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}

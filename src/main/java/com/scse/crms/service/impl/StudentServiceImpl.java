package com.scse.crms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scse.crms.mapper.StudentMapper;
import com.scse.crms.po.Student;
import com.scse.crms.service.StudentService;

/**
 * 
 * <p>Description:学生管理 </p>
 * @date 2017年10月14日 下午5:38:58
 * @author HometownWu
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	public List<Student> findStudentBy(Student student) {
		// 
		return studentMapper.findStudentBy(student);
	}

	public void insertStudent(Student student) {
		// 
		studentMapper.insertStudent(student);
	}

}

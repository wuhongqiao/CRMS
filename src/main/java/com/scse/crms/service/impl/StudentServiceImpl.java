package com.scse.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.scse.crms.mapper.StudentMapper;
import com.scse.crms.po.Student;
import com.scse.crms.po.StudentVo;
import com.scse.crms.service.StudentService;

/**
 * 
 * <p>Description:学生管理 </p>
 * @date 2017年10月14日 下午5:38:58
 * @author HometownWu
 *
 */
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	public Student findStudentById(StudentVo studentVo) {
		// 
		return studentMapper.findStudentById(studentVo);
	}

	public void insertStudent(StudentVo studentVo) {
		// 
		studentMapper.insertStudent(studentVo);
	}

}

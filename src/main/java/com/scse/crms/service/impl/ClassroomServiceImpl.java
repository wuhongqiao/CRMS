package com.scse.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.scse.crms.mapper.ClassroomMapper;
import com.scse.crms.po.Classroom;
import com.scse.crms.service.ClassroomService;

public class ClassroomServiceImpl implements ClassroomService {
	@Autowired
	private ClassroomMapper classroomMapper; 

	public Classroom selectClassroom(String crid) {
		
		return classroomMapper.selectClassroom(crid);
	}

}

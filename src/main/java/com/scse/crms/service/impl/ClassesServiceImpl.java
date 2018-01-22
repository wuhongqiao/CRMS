package com.scse.crms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scse.crms.mapper.ClassesMapper;
import com.scse.crms.service.ClassesService;

@Service
public class ClassesServiceImpl implements ClassesService {
	@Autowired
	private ClassesMapper mapper;

	public List selectSchedule() {
		return mapper.selectSchedule();
	}

}

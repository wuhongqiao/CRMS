package com.scse.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scse.crms.mapper.UserMapper;
import com.scse.crms.po.User;
import com.scse.crms.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	public User login(User user) {
		
		return userMapper.login(user);
	}

}

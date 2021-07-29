package com.example.demo.service.Imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 登录
	 */
	@Override
	public User getUserLogin(User user) {
		// TODO Auto-generated method stub
		return userMapper.getUserLogin(user);
	}

	
}

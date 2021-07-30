package com.example.demo.service.Imp;


import java.util.List;

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

	/**
	 * 查询所有用户
	 */
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userMapper.getUser();
	}
	/**
	 * 新增用户
	 */
	@Override
	public int AddUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.AddUser(user);
	}

	/**
	 * 删除用户
	 */
	@Override
	public int DelUserById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.DelUserById(id);
	}
	
	/**
	 * 修改用户信息
	 */
	@Override
	public int UpdateByUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.UpdateByUser(user);
	}

	
	
}

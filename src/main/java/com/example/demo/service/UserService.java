package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.User;

public interface UserService {
	
	/**
	 * 登录接口
	 * @param user
	 * @return
	 */
	User getUserLogin(User user);
	
	List<User> getUser();
}

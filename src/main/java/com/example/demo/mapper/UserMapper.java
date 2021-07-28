package com.example.demo.mapper;

import com.example.demo.pojo.User;

public interface UserMapper {
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	User getUserLogin(User user);
}

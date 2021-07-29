package com.example.demo.mapper;

import java.util.List;

import com.example.demo.pojo.User;

public interface UserMapper {
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	User getUserLogin(User user);
	
	/**
	 * 查询所有用户（除管理员外）
	 * @return
	 */
	List<User> getUser();>
}

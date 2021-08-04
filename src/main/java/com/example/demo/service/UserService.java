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
	
	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> getUser();
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	int AddUser(User user);
	
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	int DelUserById(String id);
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	int UpdateByUser(User user);
}

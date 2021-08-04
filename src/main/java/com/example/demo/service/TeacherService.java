package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Teacher;

public interface TeacherService {
	/**
	 * 查询
	 * @return
	 */
	List<Teacher> getAllList();
	
	/**
	 * 增加
	 * @param record
	 * @return
	 */
	int insertSelective(Teacher record);
	
	
	/**
	 * 修改
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Teacher record);
	
	/**
	 * 删除
	 * @param tId
	 * @return
	 */
	int deleteByPrimaryKey(String tNo);
	
	List<Teacher> getTeacherLogin(String account);
}

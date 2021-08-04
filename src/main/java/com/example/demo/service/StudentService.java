package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Student;

public interface StudentService {
	
	/**
	 * 新增学生信息
	 * @param record
	 * @return
	 */
	int insertSelective(Student record);
	/**
	 * 查询学生所有信息
	 * @return
	 */
	List<Student> getAll();
	
	/**
	 * 删除学生
	 * @param sId
	 * @return
	 */
	int deleteByPrimaryKey(String sId);
	
	/**
	 * 修改信息
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Student record);
}

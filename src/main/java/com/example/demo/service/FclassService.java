package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Fclass;

public interface FclassService {
	/**
	 * 查询所有字段
	 * @return
	 */
	List<Fclass> GetAll();
	/**
	 * 搜索框
	 * @param classname
	 * @return
	 */
	List<Fclass> getOne(String classname);
	/**
	 * 增加班级
	 * @param record
	 * @return
	 */
	int insertSelective(Fclass record);
	/**
	 * 删除班级
	 * @param cId
	 * @return
	 */
	int deleteByPrimaryKey(Long cId);
	/**
	 * 修改班级
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Fclass record);
	
	int GetOneFclass(String classname);
}

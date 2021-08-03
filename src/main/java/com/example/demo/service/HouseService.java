package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.HouseHold;

public interface HouseService {
	/**
	 * 查询所有学生家庭信息
	 * @param record
	 * @return
	 */
	List<HouseHold> getAllhouse();
	
	/**
	 * 插入信息
	 * @param record
	 * @return
	 */
	int insertSelective(HouseHold record);
	
	/**
	 * 删除
	 * @param hId
	 * @return
	 */
	int deleteByPrimaryKey(Long hId);
	
	/**
	 * 修改
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(HouseHold record);
}

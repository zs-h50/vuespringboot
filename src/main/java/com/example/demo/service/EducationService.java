package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Education;

public interface EducationService {
	
	List<Education> getAll();
	
	int insertSelective(Education record);
	
	int deleteByPrimaryKey(Long eId);
	
	int updateByPrimaryKeySelective(Education record);
}

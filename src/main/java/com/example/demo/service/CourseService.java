package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Course;

public interface CourseService {

	List<Course> getOnCourse(String cNo,String cName);
	int insertSelective(Course record);
	
	List<Course> getAllCourse();
	
	int updateByPrimaryKeySelective(Course record);
}

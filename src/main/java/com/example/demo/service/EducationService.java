package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Education;

public interface EducationService {
	
	List<Education> getAll();
	
	int insertSelective(Education record);
	
	int deleteByPrimaryKey(Long eId);
	
	int updateByPrimaryKeySelective(Education record);
	
	List<Education> getTeacherCourse(String account);
	
	 List<Education> getStudentCourse(String account);
	
	List<Education> geteSemester(String eSemester,String account);
	
	 List<Education> geteSemestertwo(String eFettle,String account);
	 
	 
	List<Education> getStudenteSemester(String eSemester,String account);
	List<Education> getStudenteSemestertwo(String eFettle,String account);
	
	List<Education> getOneCourse(Long cId,Integer courseId);
	
	List<Education> getTeacherFclass(Long tId);
	
	List<Education> getCourseFclass(Long cId);
}

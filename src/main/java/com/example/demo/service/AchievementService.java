package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Achievement;

public interface AchievementService {

	 List<Achievement> GetAll();
	 
	 List<Achievement> GetSome(String data);
	 
	 List<Achievement> GetTeacherExam(String account);
	 
	 int insertSelective(Achievement record);
	 
	 int updateByPrimaryKeySelective(Achievement record);
	 
	 List<Achievement> GetStudentExam(String account);
	 
	 List<Achievement> GetStudentExamSearch(String account,String result);
	 
	 List<Achievement> GetStudentExamSearchOne(String account,String aSemester);
	 
	 int DeleteAchievement(Long cId);
	 
	 List<Achievement> getOneAchievement(Long sId,Long cId);
	 
	 List<Achievement> StudentExam(String cNo,String classname);
	 
	 int DeleteExam(Long aId);
}

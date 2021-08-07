package com.example.demo.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.EducationMapper;
import com.example.demo.pojo.Education;
import com.example.demo.service.EducationService;

@Service
public class EducationServiceImp implements EducationService{

	
	@Autowired
	private EducationMapper  educationMapper;
	
	@Override
	public List<Education> getAll() {
		// TODO Auto-generated method stub
		return educationMapper.getAll();
	}

	@Override
	public int insertSelective(Education record) {
		// TODO Auto-generated method stub
		return educationMapper.insertSelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Long eId) {
		// TODO Auto-generated method stub
		return educationMapper.deleteByPrimaryKey(eId);
	}

	@Override
	public int updateByPrimaryKeySelective(Education record) {
		// TODO Auto-generated method stub
		return educationMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Education> getTeacherCourse(String account) {
		// TODO Auto-generated method stub
		return educationMapper.getTeacherCourse(account);
	}

	@Override
	public List<Education> geteSemester(String eSemester,String account) {
		// TODO Auto-generated method stub
		return educationMapper.geteSemester(eSemester,account);
	}

	@Override
	public List<Education> geteSemestertwo(String eFettle, String account) {
		// TODO Auto-generated method stub
		return educationMapper.geteSemestertwo(eFettle, account);
	}

	@Override
	public List<Education> getStudentCourse(String account) {
		// TODO Auto-generated method stub
		return educationMapper.getStudentCourse(account);
	}

	@Override
	public List<Education> getStudenteSemester(String eSemester, String account) {
		// TODO Auto-generated method stub
		return educationMapper.getStudenteSemester(eSemester, account);
	}

	@Override
	public List<Education> getStudenteSemestertwo(String eFettle, String account) {
		// TODO Auto-generated method stub
		return educationMapper.getStudenteSemestertwo(eFettle, account);
	}

	@Override
	public List<Education> getOneCourse(Long cId,Integer courseId) {
		// TODO Auto-generated method stub
		return educationMapper.getOneCourse(cId,courseId);
	}

	@Override
	public List<Education> getTeacherFclass(Long tId) {
		// TODO Auto-generated method stub
		return educationMapper.getTeacherFclass(tId);
	}

	@Override
	public List<Education> getCourseFclass(Long cId) {
		// TODO Auto-generated method stub
		return educationMapper.getCourseFclass(cId);
	}
	
	
}

package com.example.demo.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CourseMapper;
import com.example.demo.pojo.Course;
import com.example.demo.service.CourseService;

@Service
public class CourseServiceImp implements CourseService {

	@Autowired
	private CourseMapper cMapper;

	@Override
	public List<Course> getOnCourse(String cNo, String cName) {
		// TODO Auto-generated method stub
		return cMapper.getOnCourse(cNo, cName);
	}

	@Override
	public int insertSelective(Course record) {
		// TODO Auto-generated method stub
		return cMapper.insertSelective(record);
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return cMapper.getAllCourse();
	}

	@Override
	public int updateByPrimaryKeySelective(Course record) {
		// TODO Auto-generated method stub
		return cMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public String getCno() {
		// TODO Auto-generated method stub
		return cMapper.getCno();
	}

	@Override
	public int DeleteCourse(Long cId) {
		// TODO Auto-generated method stub
		return cMapper.DeleteCourse(cId);
	}

}

package com.example.demo.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TeacherMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.Teacher;
import com.example.demo.pojo.User;
import com.example.demo.service.TeacherService;

@Service
public class TeacherServiceImp implements TeacherService{

	@Autowired
	private TeacherMapper teacherMapper;
	/**
	 * 查询
	 */
	@Override
	public List<Teacher> getAllList() {
		// TODO Auto-generated method stub
		return teacherMapper.getAllList();
	}

	/**
	 * 增加
	 */
	@Override
	public int insertSelective(Teacher record) {
		// TODO Auto-generated method stub
		return teacherMapper.insertSelective(record);
	}

	/**
	 * 修改
	 */
	@Override
	public int updateByPrimaryKeySelective(Teacher record) {
		// TODO Auto-generated method stub
		return teacherMapper.updateByPrimaryKeySelective(record);
	}

	 /**
	  * 删除
	  */
	@Override
	public int deleteByPrimaryKey(String tNo) {
		// TODO Auto-generated method stub
		return teacherMapper.deleteByPrimaryKey(tNo);
	}

	@Override
	public List<Teacher> getTeacherLogin(String account) {
		// TODO Auto-generated method stub
		return teacherMapper.getTeacherLogin(account);
	}

	@Override
	public List<Teacher> GetOneTeacher(String tNo) {
		// TODO Auto-generated method stub
		return teacherMapper.GetOneTeacher(tNo);
	}

	/**
	 * 寻找最大的编号
	 */
	@Override
	public String getMax() {
		// TODO Auto-generated method stub
		return teacherMapper.getMax();
	}


	
	
	
}

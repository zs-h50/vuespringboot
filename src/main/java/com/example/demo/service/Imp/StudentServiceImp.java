package com.example.demo.service.Imp;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.User;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImp implements StudentService{

	
	@Autowired
	private StudentMapper studentMapper;
	
	/**
	 * 添加学生信息
	 */
	@Override
	public int insertSelective(Student record) {
		// TODO Auto-generated method stub
		return studentMapper.insertSelective(record);
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentMapper.getAll();
	}

	@Override
	public int deleteByPrimaryKey(String sId) {
		// TODO Auto-generated method stub
		return studentMapper.deleteByPrimaryKey(sId);
	}

	@Override
	public int updateByPrimaryKeySelective(Student record) {
		// TODO Auto-generated method stub
		return studentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Student> getStudent(String account) {
		// TODO Auto-generated method stub
		return studentMapper.getStudent(account);
	}

	@Override
	public List<Student> getStduents(String sNo) {
		// TODO Auto-generated method stub
		return studentMapper.getStduents(sNo);
	}

	@Override
	public String getSno() {
		// TODO Auto-generated method stub
		return studentMapper.getSno();
	}


	
	
}

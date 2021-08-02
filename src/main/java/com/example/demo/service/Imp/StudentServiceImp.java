package com.example.demo.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
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
	public int deleteByPrimaryKey(Long sId) {
		// TODO Auto-generated method stub
		return studentMapper.deleteByPrimaryKey(sId);
	}
	
	
	
}

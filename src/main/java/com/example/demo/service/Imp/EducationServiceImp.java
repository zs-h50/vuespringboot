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
	
	

	
}

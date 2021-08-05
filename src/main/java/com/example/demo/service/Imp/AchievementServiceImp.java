package com.example.demo.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AchievementMapper;
import com.example.demo.pojo.Achievement;
import com.example.demo.service.AchievementService;


@Service
public class AchievementServiceImp implements AchievementService {

	
	@Autowired
	private AchievementMapper aMapper;

	@Override
	public List<Achievement> GetAll() {
		// TODO Auto-generated method stub
		return aMapper.GetAll();
	}

	@Override
	public List<Achievement> GetSome(String data) {
		// TODO Auto-generated method stub
		return aMapper.GetSome(data);
	}

	@Override
	public List<Achievement> GetTeacherExam(String account) {
		// TODO Auto-generated method stub
		return aMapper.GetTeacherExam(account);
	}

	@Override
	public int insertSelective(Achievement record) {
		// TODO Auto-generated method stub
		return aMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(Achievement record) {
		// TODO Auto-generated method stub
		return aMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Achievement> GetStudentExam(String account) {
		// TODO Auto-generated method stub
		return aMapper.GetStudentExam(account);
	}

	@Override
	public List<Achievement> GetStudentExamSearch(String account, String result) {
		// TODO Auto-generated method stub
		return aMapper.GetStudentExamSearch(account, result);
	}

	@Override
	public List<Achievement> GetStudentExamSearchOne(String account, String aSemester) {
		// TODO Auto-generated method stub
		return aMapper.GetStudentExamSearchOne(account, aSemester);
	}
	
	
	
	
	
}

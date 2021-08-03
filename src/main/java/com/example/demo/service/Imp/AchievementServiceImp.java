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
	
	
	
}

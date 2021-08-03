package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Achievement;

public interface AchievementService {

	 List<Achievement> GetAll();
	 
	 List<Achievement> GetSome(String data);
}

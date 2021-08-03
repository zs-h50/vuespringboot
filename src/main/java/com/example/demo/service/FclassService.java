package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Fclass;

public interface FclassService {
	
	List<Fclass> GetAll();
	List<Fclass> getOne(String datas);
}

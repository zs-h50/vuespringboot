package com.example.demo.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.FclassMapper;
import com.example.demo.pojo.Fclass;
import com.example.demo.service.FclassService;

@Service
public class FclassServiceImp implements FclassService {

	
	@Autowired
	private FclassMapper fclassMapper;
	
	@Override
	public List<Fclass> GetAll() {
		// TODO Auto-generated method stub
		return fclassMapper.GetAll();
	}

	@Override
	public List<Fclass> getOne(String datas) {
		// TODO Auto-generated method stub
		return fclassMapper.getOne(datas);
	}

	
	
}

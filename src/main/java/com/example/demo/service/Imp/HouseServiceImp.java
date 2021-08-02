package com.example.demo.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.HouseHoldMapper;
import com.example.demo.pojo.HouseHold;
import com.example.demo.service.HouseService;

@Service
public class HouseServiceImp implements HouseService{

	@Autowired
	private HouseHoldMapper houseMapper;
	
	/**
	 * 查询
	 */
	@Override
	public List<HouseHold> getAllhouse() {
		// TODO Auto-generated method stub
		return houseMapper.getAllhouse();
	}

	/**
	 * 新增
	 */
	@Override
	public int insertSelective(HouseHold record) {
		// TODO Auto-generated method stub
		return houseMapper.insertSelective(record);
	}

	
	
}

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
	public List<Fclass> getOne(String classname) {
		// TODO Auto-generated method stub
		return fclassMapper.getOne(classname);
	}

	@Override
	public int insertSelective(Fclass record) {
		// TODO Auto-generated method stub
		return fclassMapper.insertSelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Long cId) {
		// TODO Auto-generated method stub
		return fclassMapper.deleteByPrimaryKey(cId);
	}

	@Override
	public int updateByPrimaryKeySelective(Fclass record) {
		// TODO Auto-generated method stub
		return fclassMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int GetOneFclass(String classname) {
		// TODO Auto-generated method stub
		return fclassMapper.GetOneFclass(classname);
	}

	
	
}

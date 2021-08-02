package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.HouseHold;
import com.example.demo.service.HouseService;
import com.example.demo.utils.Result;

@Controller
public class HouseController {

	@Autowired 
	private HouseService houseService;
	
	@ResponseBody
	@PostMapping("/admin/house/add")
	public Result getAdd(@RequestBody HouseHold houseHold) {
		houseService.insertSelective(houseHold);
		return Result.success();
	}
}

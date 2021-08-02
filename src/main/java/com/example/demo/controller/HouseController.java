package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.HouseHold;
import com.example.demo.service.HouseService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class HouseController {

	@Autowired 
	private HouseService houseService;
	
	@ResponseBody
	@RequestMapping("/admin/house/select")
	public Result<HouseHold> GetAll(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum){
		System.out.println("查询数据中..........");
		//pageNum 当前页码
		PageHelper.startPage(pageNum,8);
		List<HouseHold> lists = houseService.getAllhouse();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<HouseHold> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
	
	
	/**
	 * 添加
	 * @param houseHold
	 * @return
	 */
	@ResponseBody
	@PostMapping("/admin/house/add")
	public Result getAdd(@RequestBody HouseHold houseHold) {
		houseService.insertSelective(houseHold);
		return Result.success();
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@ResponseBody
	@DeleteMapping("/admin/house/delete/{id}")
	public Result DelHouse(@PathVariable Long id) {
		houseService.deleteByPrimaryKey(id);
		return Result.success();
	}
	
}

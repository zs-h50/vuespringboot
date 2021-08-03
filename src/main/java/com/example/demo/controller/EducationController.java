package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Education;
import com.example.demo.service.EducationService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class EducationController {

	@Autowired
	private EducationService educationService;
	
	@RequestMapping("/admin/course/select")
	public Result Getall(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum) {
		System.out.println("查询数据中..........");
		//pageNum 当前页码
		PageHelper.startPage(pageNum,8);
		List<Education> lists = educationService.getAll();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Education> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
	
	@PostMapping("/admin/course/add")
	public Result AddEducation(@RequestBody Education education) {
		System.out.println("正在插入数据到数据库！！！！！");
		int temp = educationService.insertSelective(education);
		if (temp != 0) {
			System.out.println("插入成功！");
		}else {
			System.out.println("插入失败！");
		}
		return Result.success();
	}
	
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@DeleteMapping("/admin/course/delete/{id}")
	public Result DelStu(@PathVariable Long id) {
		educationService.deleteByPrimaryKey(id);
		return Result.success();
	}
	
	/**
	 * 修改
	 * @param teacher
	 * @return
	 */
	@PostMapping("/admin/course/update")
	public Result UpdataEd(@RequestBody Education education) {
		educationService.updateByPrimaryKeySelective(education);
		return Result.success();
	}
	
	
}

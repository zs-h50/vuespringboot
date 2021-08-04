package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Achievement;
import com.example.demo.service.AchievementService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class AchievementController {
	
	@Autowired
	private AchievementService aService;
	
	@RequestMapping("/admin/exam/select")
	public Result GetExam(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum) {
		System.out.println("查询数据中..........");
		//pageNum 当前页码
		PageHelper.startPage(pageNum,8);
		List<Achievement> lists = aService.GetAll();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Achievement> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
	
	@PostMapping("/admin/exam/select/search")
	public Result<Achievement> GetSelect(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@RequestBody String data){
		PageHelper.startPage(pageNum,8);
		
		System.out.println(data);
		if (data.equals(" ")) {
			data = "%";
		}else {
			data = "%"+data+"%";
		}
		List<Achievement> lists = aService.GetSome(data);
//		Iterator iterator  = lists.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Achievement> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
		return Result.success(lists);
	}
	
	@PostMapping("/teacher/exam/select")
	public Result<Achievement> teacherExam(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@RequestBody String account){
		System.out.println(account);
		PageHelper.startPage(pageNum,8);
		List<Achievement> lists = aService.GetTeacherExam(account);
		PageInfo<Achievement> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
		return Result.success(lists);
	}
	
}

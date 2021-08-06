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

import com.example.demo.pojo.Course;
import com.example.demo.service.CourseService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class CourseController {

	@Autowired
	private CourseService cService;

	@PostMapping("/admin/addcourse")
	public Result AddCourse(@RequestBody Course course) {
//		System.out.println(course.getcNo());
		List<Course> list = cService.getOnCourse(course.getcNo(),course.getcName());
		 if ( list.size() !=0 ) {
			 System.out.println("课程已存在"); 
			 return Result.error(); 
		}else {
			 cService.insertSelective(course);
			 return Result.success();
		  }
	}

	@PostMapping("/admin/addcourse/select")
	public Result getAll(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum) {
		PageHelper.startPage(pageNum, 8);
		List<Course> lists = cService.getAllCourse();
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Course> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo", pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}

	@PostMapping("/admin/updatecourse")
	public Result UpdataCourse(@RequestBody Course course) {
		cService.updateByPrimaryKeySelective(course);
		return Result.success();
	}

}

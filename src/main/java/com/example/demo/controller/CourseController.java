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
import com.example.demo.pojo.Education;
import com.example.demo.service.AchievementService;
import com.example.demo.service.CourseService;
import com.example.demo.service.EducationService;
import com.example.demo.utils.Pages;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class CourseController {

	@Autowired
	private CourseService cService;

	@Autowired
	private AchievementService aService;
	
	@Autowired
	private EducationService eService;

	@PostMapping("/admin/addcourse")
	public Result AddCourse(@RequestBody Course course) {
//		System.out.println(course.getcNo());
		List<Course> list = cService.getOnCourse(course.getcNo(), course.getcName());
		if (list.size() != 0) {
			System.out.println("课程已存在");
			return Result.error();
		} else {
			String cno = cService.getCno();
			Integer a = Integer.valueOf(cno) + 1;
			course.setcNo(String.valueOf(a));
			cService.insertSelective(course);
			return Result.success();
		}
	}

	@PostMapping("/admin/addcourse/select")
	public Result getAll(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum) {
		List<Course> lists = cService.getAllCourse();
		PageHelper.startPage(pageNum, Pages.defaultPageSize);

		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Course> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo", pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}

	@PostMapping("/admin/addcourse/updatecourse")
	public Result UpdataCourse(@RequestBody Course course) {
		cService.updateByPrimaryKeySelective(course);
		return Result.success();
	}

	// deleteByPrimaryKey
	@DeleteMapping("/admin/addcourse/deletcourse/{cId}")
	public Result DeleteCourse(@PathVariable Long cId) {
		cService.DeleteCourse(cId);
		//如果删除课程也把该课程所有成绩删除
//		aService.DeleteAchievement(cId);
		return Result.success();
	}

	@PostMapping("/admin/addcourse/fclass")
	public Result<Education> getCourseResult(Model model,@RequestBody Long cId){
		List<Education> lists = eService.getCourseFclass(cId);
		model.addAttribute(lists);
		return Result.success(lists);
	}
}

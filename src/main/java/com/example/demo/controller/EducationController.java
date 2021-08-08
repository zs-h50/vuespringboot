package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Education;
import com.example.demo.pojo.Student;
import com.example.demo.service.EducationService;
import com.example.demo.utils.Pages;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class EducationController {

	@Autowired
	private EducationService educationService;

	@RequestMapping("/admin/course/select")
	public Result Getall(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum) {
		System.out.println("查询数据中..........");
		// pageNum 当前页码
		List<Education> lists = educationService.getAll();
		PageHelper.startPage(pageNum, Pages.defaultPageSize);
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Education> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo", pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}

	/**
	 * 分配课程
	 * 
	 * @param education
	 * @return
	 */
	@PostMapping("/admin/course/add")
	public Result AddEducation(@RequestBody Education education) {
		System.out.println("正在插入数据到数据库！！！！！");
		List<Education> oneCourse = educationService.getOneCourse(education.getcId(), education.getCourseId());
		if (oneCourse.size() != 0) {
			System.out.println("老师已授这门课，请重新选择");
			return Result.error("100", "这班级已有老师授这门课，请重新选择");
		} else {
			int temp = educationService.insertSelective(education);
			if (temp != 0) {
				System.out.println("插入成功！");
			} else {
				System.out.println("插入失败！");
			}
			return Result.success();
		}

	}

	/**
	 * 删除
	 * 
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
	 * 
	 * @param teacher
	 * @return
	 */
	@PostMapping("/admin/course/update")
	public Result UpdataEd(@RequestBody Education education) {
		educationService.updateByPrimaryKeySelective(education);
		return Result.success();
	}

	@PostMapping("/teacher/course/select")
	public Result TeacherCourse(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum,
			@RequestBody String account) {
		PageHelper.startPage(pageNum, Pages.defaultPageSize);
		List<Education> lists = educationService.getTeacherCourse(account);
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Education> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo", pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}

	/**
	 * 老师课程搜索框1
	 * 
	 * @param model
	 * @param pageNum
	 * @param e
	 * @param account
	 * @return
	 */
	@GetMapping("/teacher/course/select/one")
	public Result TeacherCourseSearch(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum,
			@RequestParam String e, @RequestParam String account) {
		int eSemester = Integer.valueOf(e);
		System.out.println(eSemester);
		System.out.println(account);
		List<Education> lists = educationService.geteSemester(e, account);
		PageHelper.startPage(pageNum, Pages.defaultPageSize);
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Education> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo", pageInfo);
		return Result.success(lists);
	}

	/**
	 * 老师课程搜索框2
	 * 
	 * @param model
	 * @param pageNum
	 * @param e
	 * @param account
	 * @return
	 */
	@GetMapping("/teacher/course/select/two")
	public Result TeacherCourseSearchtwo(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum,
			@RequestParam String e, @RequestParam String account) {
		int eSemester = Integer.valueOf(e);
		System.out.println(eSemester);
		System.out.println(account);
		List<Education> lists = educationService.geteSemestertwo(e, account);
		PageHelper.startPage(pageNum, Pages.defaultPageSize);
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Education> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo", pageInfo);
		return Result.success(lists);
	}

	@GetMapping("/student/course/select/one")
	public Result StudentCourseSearch(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum,
			@RequestParam String e, @RequestParam String account) {
		PageHelper.startPage(pageNum, Pages.defaultPageSize);
		List<Education> lists = educationService.getStudenteSemester(e, account);
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Education> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo", pageInfo);
		return Result.success(lists);
	}

	@GetMapping("/student/course/select/two")
	public Result StudentCourseSearchtwo(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum,
			@RequestParam String e, @RequestParam String account) {
		PageHelper.startPage(pageNum, Pages.defaultPageSize);
		List<Education> lists = educationService.getStudenteSemestertwo(e, account);
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Education> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo", pageInfo);
		return Result.success(lists);
	}

	@PostMapping("/student/course/select")
	public Result StudentCourse(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum,
			@RequestBody String account) {
		PageHelper.startPage(pageNum, Pages.defaultPageSize);
		List<Education> lists = educationService.getStudentCourse(account);
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Education> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo", pageInfo);
		return Result.success(lists);
	}
	
	@PostMapping("/education/teacher/student/select")
	public Result getTeacherStduentCourseFclass(@RequestBody String account) {
		List<Education> stduentFclass = educationService.getTeacherStduentCourse(account);
		//model.addAttribute(stduentFclass);
		return Result.success(stduentFclass);
	}
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.User;
import com.example.demo.service.StudentService;
import com.example.demo.service.UserService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired 
	private UserService userService;
	
	/**
	 * 新增学生数据
	 * @param student
	 * @return
	 */
	@PostMapping("/admin/studentinfo/add")
	public Result AddStudent(@RequestBody Student student) {
		System.out.println("正在插入数据到数据库！！！！！");
		int stduents = studentService.getStduents(student.getsNo());
		if (studentService!=null) {
			return Result.error();
		} else {
			User user = new User();
			user.setAccount(student.getsNo());
			user.setPassword("123456");
			user.setIdentity("1");
			userService.AddUser(user);
			int temp = studentService.insertSelective(student);

			System.out.println("插入成功！");
			return Result.success();
		}
	}
	
	/**
	 * 查询
	 * @param model
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/admin/studentinfo/select")
	public Result<Student> GetAll(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum) {
		System.out.println("查询数据中..........");
		//pageNum 当前页码
		PageHelper.startPage(pageNum,8);
		List<Student> lists = studentService.getAll();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Student> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@DeleteMapping("/admin/studentinfo/delete/{id}")
	public Result<?> DelStu(@PathVariable String id) {
		System.out.println(id);
		userService.DelUserById(id);
		studentService.deleteByPrimaryKey(id);
		return Result.success();
	}
	
	@PostMapping("/admin/studentinfo/update")
	public Result UpdataStu(@RequestBody Student student) {
		studentService.updateByPrimaryKeySelective(student);
		return Result.success();
	}
	
	@PostMapping("/student/select")
	public Result getStudent(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@RequestBody String account) {
		PageHelper.startPage(pageNum,8);
		List<Student> lists = studentService.getStudent(account);
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Student> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
}

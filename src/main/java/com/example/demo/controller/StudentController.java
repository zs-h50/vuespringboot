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

import com.example.demo.pojo.Student;
import com.example.demo.pojo.User;
import com.example.demo.service.StudentService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * 新增学生数据（还可以优化，学生信息里面包含父母，家庭里面也有，但是插入数据时应该把父母的放到家庭表中）
	 * @param student
	 * @return
	 */
	@ResponseBody
	@PostMapping("/admin/studentinfo/add")
	public Result AddStudent(@RequestBody Student student) {
		System.out.println("正在插入数据到数据库！！！！！");
		int temp = studentService.insertSelective(student);
		if (temp != 0) {
			System.out.println("插入成功！");
		}else {
			System.out.println("插入失败！");
		}
		return Result.success();
	}
	
	/**
	 * 查询
	 * @param model
	 * @param pageNum
	 * @return
	 */
	@ResponseBody
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
	@ResponseBody
	@DeleteMapping("/admin/studentinfo/delete/{id}")
	public Result DelStu(@PathVariable Long id) {
		studentService.deleteByPrimaryKey(id);
		return Result.success();
	}
	
	@ResponseBody
	@PostMapping("/admin/studentinfo/update")
	public Result UpdataStu(@RequestBody Student student) {
		studentService.updateByPrimaryKeySelective(student);
		return Result.success();
	}
}

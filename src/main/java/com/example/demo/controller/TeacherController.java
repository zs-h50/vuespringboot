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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.Teacher;
import com.example.demo.service.TeacherService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	/**
	 * 查询全部老师的信息
	 * @param model
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/admin/teacher/select")
	public Result<Teacher> getResult(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum) {
		System.out.println("查询数据中..........");
		//pageNum 当前页码
		PageHelper.startPage(pageNum,8);
		List<Teacher> lists = teacherService.getAllList();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Teacher> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
	

	@PostMapping("/admin/teacher/add")
	public Result AddTeacher(@RequestBody Teacher teacher) {
		System.out.println("正在插入数据到数据库！！！！！");
		int temp = teacherService.insertSelective(teacher);
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
	@DeleteMapping("/admin/teacher/delete/{id}")
	public Result DelStu(@PathVariable Long id) {
		teacherService.deleteByPrimaryKey(id);
		return Result.success();
	}
	
	/**
	 * 修改
	 * @param teacher
	 * @return
	 */
	@PostMapping("/admin/teacher/update")
	public Result UpdataTea(@RequestBody Teacher teacher) {
		teacherService.updateByPrimaryKeySelective(teacher);
		return Result.success();
	}
	
}

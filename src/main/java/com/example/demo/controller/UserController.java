package com.example.demo.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 登录模块
	 * @param user
	 * @return
	 */
//	@ResponseBody
	@PostMapping("/login")
	public Result Login(@RequestBody User user) {
		System.out.println("传入的数据");
		System.out.println(user.getAccount());
		System.out.println(user.getPassword());
		System.out.println(user.getIdentity());
		System.out.println("=========================");
		User user2 =  userService.getUserLogin(user);
		
		if (user2 != null) {
			System.out.println("查询成功！");
			System.out.println(user2.getAccount());
			System.out.println(user2.getPassword());
			System.out.println(user2.getIdentity());
		}else {
			System.out.println("查询不到该用户！");
		}
//		System.out.println(user2.getAccount());
		System.out.println("===============================");
		
		return Result.success(user2);
	}
	
	
	/**
	 * 查询所有用户
	 * @param model
	 * @param pageNum
	 * @return
	 */
//	@ResponseBody
	@RequestMapping("/admin/operate")
	public Result<User> getAllUser(Model model,@RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum){
		System.out.println("查询数据中..........");
		//pageNum 当前页码
		PageHelper.startPage(pageNum,8);
		List<User> lists = userService.getUser();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<User> pageInfo = new PageInfo<>(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
//	@ResponseBody
	@RequestMapping(value = "/admin/operate/adds",method = RequestMethod.POST)
	public Result AddUser(@RequestBody User user) {
		System.out.println("要插入的数据如下：");
		System.out.println(user.getAccount());
		System.out.println(user.getPassword());
		System.out.println(user.getIdentity());
		int temp = userService.AddUser(user);
		if (temp > 0) {
			System.out.println("插入数据成功!!!");
		} else {
			System.out.println("插入数据失败！！！");
		}
		return Result.success();
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
//	@ResponseBody
	@DeleteMapping("/admin/operate/delete/{id}")
	public Result DeleteUser(@PathVariable String id) {
		System.out.println("要删除的用户id："+id);
		int temp =  userService.DelUserById(id);
		if (temp != 0 ) {
			System.out.println("删除成功！！");
		} else {
			System.out.println("删除失败！！");
		}
		return Result.success();
	}
	
	/**
	 * 修改单元格里面的用户信息
	 * @param user
	 * @return
	 */
//	@ResponseBody
	@PutMapping("/admin/operate/update")
	public Result UpdateUser(@RequestBody User user) {
		System.out.println("进入修改信息");
		if (user.getPassword() == null) {
			return Result.error("300", "密码不能为空");
		}else {
			int temp = userService.UpdateByUser(user);
			if (temp != 0) {
				System.out.println("修改成功！！！");
			} else {
				System.out.println("修改失败！！！");
			}
			return Result.success();
		}
	}
	
	@GetMapping("/teacher/updats")
	public Result UserUpdate(@RequestParam String account, @RequestParam String password) {
		System.out.println("1111111111111111111111111");
		System.out.println(account);
		System.out.println(password);
		userService.UpdateUser(account,password);
		return Result.success();
	}
	
	@GetMapping("/student/updats")
	public Result UpStduent(@RequestParam String account, @RequestParam String password) {
		userService.UpdateUser(account,password);
		return Result.success();
	}
}

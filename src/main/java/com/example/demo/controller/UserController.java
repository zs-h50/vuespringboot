package com.example.demo.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 登录模块
	 * @param user
	 * @return
	 */
	@ResponseBody
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
	
	@ResponseBody
	@PostMapping
	public Result<User> getAllUser(Model model,@RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum){
		System.out.println("查询数据中..........");
		//pageNum 当前页码
		PageHelper.startPage(pageNum, 8);
		List<User> lists = userService.getUser();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<User> pageInfo = new PageInfo<>(lists);
		model.addAttribute("pageInfo",pageInfo);
		return Result.success(lists);
	}
}

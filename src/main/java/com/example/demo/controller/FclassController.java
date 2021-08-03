package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Fclass;
import com.example.demo.service.FclassService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class FclassController {

	@Autowired
	private FclassService fclassService;
	
	@RequestMapping("/admin/fclass/select")
	public Result<Fclass> GetAll(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum){
		System.out.println("查询数据中..........");
		//pageNum 当前页码
//		datas = "%"+datas+"%";
		PageHelper.startPage(pageNum,8);
		List<Fclass> lists = fclassService.GetAll();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Fclass> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
	
	@GetMapping("/admin/fclass/select/{datas}")
	public Result<Fclass> GetSelect(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@PathVariable String datas){
		PageHelper.startPage(pageNum,8);
		datas = "%"+datas+"%";
		List<Fclass> lists = fclassService.getOne(datas);
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Fclass> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
		return Result.success(null);
	}
	
}

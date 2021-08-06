package com.example.demo.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		PageHelper.startPage(pageNum,8);
		List<Fclass> lists = fclassService.GetAll();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Fclass> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
	//@RequestParam(defaultValue = "")
	@RequestMapping("/admin/fclass/select/search")
	public Result<Fclass> GetSelect(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@RequestBody String classname){
		PageHelper.startPage(pageNum,8);
		
		System.out.println(classname);
		if (classname.equals(" ")) {
			classname = "%";
		}else {
			classname = "%"+classname+"%";
		}
		List<Fclass> lists = fclassService.getOne(classname);
//		Iterator iterator  = lists.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Fclass> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
		return Result.success(lists);
	}
	
	/**
	 * 添加
	 * @param houseHold
	 * @return
	 */

	@PostMapping("/admin/fclass/add")
	public Result getAdd(@RequestBody Fclass fclass) {
		String classname = fclass.getClassname();
		 List<Fclass> list = fclassService.GetOneFclass(classname);
		if (list.size() != 0) {
			System.out.println("班级已存在");
			return Result.error();
		}else {
			fclassService.insertSelective(fclass);
			return Result.success();
		}

	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */

	@DeleteMapping("/admin/fclass/delete/{id}")
	public Result DelFclass(@PathVariable Long id) {
		fclassService.deleteByPrimaryKey(id);
		return Result.success();
	}
	
	/**
	 * 改
	 * @param houseHold
	 * @return
	 */

	@PostMapping("/admin/fclass/update")
	public Result updateByPrimary(@RequestBody Fclass fclass) {
		fclassService.updateByPrimaryKeySelective(fclass);
		return Result.success();
	}
	
}

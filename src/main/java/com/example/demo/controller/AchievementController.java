package com.example.demo.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Achievement;
import com.example.demo.service.AchievementService;
import com.example.demo.utils.Pages;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class AchievementController {
	
	@Autowired
	private AchievementService aService;
	
	@RequestMapping("/admin/exam/select")
	public Result GetExam(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum) {
		System.out.println("查询数据中..........");
		//pageNum 当前页码
		PageHelper.startPage(pageNum,Pages.defaultPageSize);
		List<Achievement> lists = aService.GetAll();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Achievement> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
	
	@PostMapping("/admin/exam/select/search")
	public Result<Achievement> GetSelect(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@RequestBody String data){
		PageHelper.startPage(pageNum,Pages.defaultPageSize);
		
		System.out.println(data);
		if (data.equals(" ")) {
			data = "%";
		}else {
			data = "%"+data+"%";
		}
		List<Achievement> lists = aService.GetSome(data);
//		Iterator iterator  = lists.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Achievement> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
		return Result.success(lists);
	}
	
	
	@GetMapping("/student/exam/select/search")
	public Result<Achievement> GetStduentSelect(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@RequestParam String account,@RequestParam String result){
		PageHelper.startPage(pageNum,Pages.defaultPageSize);
		System.out.println(result);
		if (result.equals(" ")) {
			result = "%";
		}else {
			result = "%"+result+"%";
		}
		List<Achievement> lists = aService.GetStudentExamSearch(account,result);
//		Iterator iterator  = lists.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Achievement> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
		return Result.success(lists);
	}
	
	@GetMapping("/student/exam/select/one")
	public Result<Achievement> GetStduentSelectSearch(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@RequestParam String account,@RequestParam String e){
		PageHelper.startPage(pageNum,Pages.defaultPageSize);
		List<Achievement> lists = aService.GetStudentExamSearchOne(account, e);
		PageInfo<Achievement> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
		return Result.success(lists);
	}
	
	
	@PostMapping("/teacher/exam/select")
	public Result<Achievement> teacherExam(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@RequestBody String account){
		System.out.println(account);
		PageHelper.startPage(pageNum,Pages.defaultPageSize);
		List<Achievement> lists = aService.GetTeacherExam(account);
		PageInfo<Achievement> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
		return Result.success(lists);
	}
	
	@PostMapping("/student/exam/select")
	public Result<Achievement> studentExam(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@RequestBody String account){
		System.out.println(account);
		PageHelper.startPage(pageNum,Pages.defaultPageSize);
		List<Achievement> lists = aService.GetStudentExam(account);
		PageInfo<Achievement> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
		return Result.success(lists);
	}
	
	/**
	 * 老师添加成绩
	 * @param achievement
	 * @return
	 */
	@PostMapping("/teacher/exam/add")
	public Result AddExam(@RequestBody Achievement achievement) {
		List<Achievement> lists = aService.getOneAchievement(achievement.getsId(), achievement.getcId());
		System.out.println(lists.size());
		if (lists.size() != 0) {
			return Result.error("100", "学生课程成绩已存在，请勿重新添加！");
		}else {
			aService.insertSelective(achievement);
			return Result.success();
		}

	}
	
	@DeleteMapping("/teacher/exam/delete/{aId}")
	public Result deleteResult(@PathVariable Long aId) {
		aService.DeleteExam(aId);
		return Result.success();
	}
	
	@PostMapping("/teacher/exam/update")
	public Result ExamUpdate(@RequestBody Achievement achievement) {
		aService.updateByPrimaryKeySelective(achievement);
		return Result.success();
	}
	
	@GetMapping("/admin/student/fclass/exam/select")
	public Result GetStudentFclassAllExam(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum,
			@RequestParam String cNo, @RequestParam String classname) {
		System.out.println("查询数据中..........");
		//pageNum 当前页码
		PageHelper.startPage(pageNum,Pages.defaultPageSize);
		List<Achievement> lists = aService.StudentExam(cNo, classname);
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行
		PageInfo<Achievement> pageInfo = new PageInfo(lists);
		model.addAttribute("pageInfo",pageInfo);
//		System.out.println("查询成功！！");
		return Result.success(lists);
	}
}

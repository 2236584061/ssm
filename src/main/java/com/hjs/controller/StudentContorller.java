package com.hjs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hjs.pojo.Student;
import com.hjs.service.StudentService;

/***
 * 
 * hjs
 * 
 * 2020-4-8
 * 
 * 
 * @author admin
 *
 */
@ResponseBody
@Controller
public class StudentContorller {

	@Resource
	private StudentService studentService;

	
	/**
	 * 
	 * 查询学生列表
	 * @return
	 */
	@RequestMapping(value  = "/getstudentlist", method = RequestMethod.POST)
	public JSONObject getStudentList() {
		
		return studentService.getStudentList();
	}

	
	/**
	 * 
	 * 查询单个学生信息
	 * @return
	 */
	@RequestMapping(value  = "/getstudent", method = RequestMethod.POST)
	public JSONObject getStudent(@RequestParam("id") String id) {
	
		return studentService.getStudent(id);
	}
	
	/**
	 * 
	 * 添加学生
	 * @return
	 */
	@RequestMapping(value  = "/addstudent")
	public JSONObject addStudent(Student student) {
	
		return studentService.addStudent(student);
	}
	
	/**
	 * 
	 * 删除学生信息
	 * @return
	 */
	@RequestMapping(value  = "/delstudent", method = RequestMethod.POST)
	public JSONObject delStudent(@RequestParam("id") String id) {
	
		return studentService.delStudent(id);
	}
	
	
	/**
	 * 
	 *  修改学生信息
	 * @return
	 */
	@RequestMapping(value  = "/updtestudent")
	public JSONObject updteStudent(Student student) {
		
		return studentService.updteStudent(student);
	}
}

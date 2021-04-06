package com.hjs.service;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.hjs.dao.StudentDao;
import com.hjs.pojo.Student;

/***
 * 
 * hjs 2020-4-8
 * 
 * 
 * @author admin
 *
 */
@Service
public class StudentService {

	@Resource
	private StudentDao studentDao;

	/**
	 * 
	 * 查询学生列表
	 * 
	 * @return
	 */
	public JSONObject getStudentList() {

		JSONObject res = new JSONObject();

		// 返回
		res.put("code", "200");
		res.put("msg", "成功");
		res.put("data", studentDao.getStudenList());

		return res;

	}

	/**
	 * 
	 * 查询单个学生信息
	 * 
	 * @return
	 */
	public JSONObject getStudent(String id) {

		JSONObject res = new JSONObject();

		// 返回
		res.put("code", "200");
		res.put("msg", "成功");
		res.put("data", studentDao.getStudent(id));

		return res;

	}

	/**
	 * 
	 * 添加学生
	 * 
	 * @return
	 */
	public JSONObject addStudent(Student student) {

		// 随机id
		student.setId(UUID.randomUUID().toString().replace("-", ""));

		// 存入数据库
		studentDao.addStudent(student);

		JSONObject res = new JSONObject();

		// 返回
		res.put("code", "200");
		res.put("msg", "成功");

		return res;
	}

	/**
	 * 
	 * 删除学生信息
	 * 
	 * @return
	 */
	public JSONObject delStudent(String id) {

		JSONObject res = new JSONObject();

		// 返回
		res.put("code", "200");
		res.put("msg", "成功");

		// 删除学生
		studentDao.delStudent(id);

		return res;

	}

	/**
	 * 
	 * 修改学生信息
	 * 
	 * @return
	 */
	public JSONObject updteStudent(Student student) {

		// 修改
		studentDao.updateStudent(student);

		JSONObject res = new JSONObject();

		// 返回
		res.put("code", "200");
		res.put("msg", "成功");

		return res;
	}

}

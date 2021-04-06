package com.hjs.dao;

import java.util.List;

import com.hjs.pojo.Student;

/**
 * 
 * crud学生表
 * 
 * 韩金澍
 * 
 * 20250-4-8
 * 
 * @author admin
 *
 */
public interface StudentDao {
	
	//查询学生列表
	public List<Student> getStudenList();
	
	//查询单个学生
	public Student getStudent(String id);
	
	//添加学生
	public void addStudent(Student s);
	
	//删除学生
	public void delStudent(String id);
	
	//修改学生信息
	public void updateStudent(Student s);
	
	

}

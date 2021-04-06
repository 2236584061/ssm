package com.hjs.pojo;

/***
 * 
 * 2020-4-8
 * 韩金澍
 * 
 * 学生实体类
 * 
 * @author admin
 *
 */
public class Student {
	
	//id
	private String id;
	
	//姓名
	private String name;
	
	//年龄
	private String age;
	
	//性别
	private String sex;
	
	//学号
	private String sno;
	
	//地址
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", sno=" + sno + ", address="
				+ address + "]";
	}

	
	
	
	

}

package com.iotek.ssm.entity;

import java.util.Date;

public class Employee {
	
	private int id;
	private String lastname;
	private String email;
	private String birth;
	private Date createtime;
	private String dept;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastname=" + lastname + ", email=" + email + ", birth=" + birth
				+ ", createtime=" + createtime + ", dept=" + dept + "]";
	}
	
	public Employee() {
		super();
	}
	public Employee(String lastname, String email, String birth, Date createtime, String dept) {
		super();
		this.lastname = lastname;
		this.email = email;
		this.birth = birth;
		this.createtime = createtime;
		this.dept = dept;
	}
	public Employee(int id, String lastname, String email, String birth, Date createtime, String dept) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.email = email;
		this.birth = birth;
		this.createtime = createtime;
		this.dept = dept;
	}

}

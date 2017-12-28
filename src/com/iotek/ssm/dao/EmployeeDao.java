package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Employee;

public interface EmployeeDao {
	
	public void add(Employee employee);
	
	public int del(int id);
	
	public void update(Employee employee);
	
	public Employee queryById(int id);
	
	public List<Employee> queryAll();

}

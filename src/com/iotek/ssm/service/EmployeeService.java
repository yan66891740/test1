package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Employee;

public interface EmployeeService {
	
	public void add(Employee employee);
	
	public int del(int id);
	
	public void update(Employee employee);
	
	public Employee queryById(int id);
	
	public List<Employee> queryAll();

}

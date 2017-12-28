package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.EmployeeDao;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void add(Employee employee) {
		employeeDao.add(employee);
	}

	@Override
	public int del(int id) {
		return employeeDao.del(id);
	}

	@Override
	public void update(Employee employee) {
		employeeDao.update(employee);;
	}
	
	@Override
	public Employee queryById(int id) {
		return employeeDao.queryById(id);
	}

	@Override
	public List<Employee> queryAll() {
		return employeeDao.queryAll();
	}

}

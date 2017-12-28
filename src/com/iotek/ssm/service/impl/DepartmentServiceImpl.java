package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.DepartmentDao;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public List<Department> queryAll() {
		return departmentDao.queryAll();
	}

}

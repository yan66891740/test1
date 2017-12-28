package com.iotek.ssm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.service.DepartmentService;
import com.iotek.ssm.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("showAll")
	public String showAll (Model model) {
		List<Employee> employees = employeeService.queryAll();
		model.addAttribute("employees", employees);
		return "show";
	}
	
	@RequestMapping("queryEmp")
	public String queryEmp(Model model, Integer id) {
		Employee employee = employeeService.queryById(id);
		model.addAttribute("employee", employee);
		List<Department> depts = departmentService.queryAll();
		model.addAttribute("depts", depts);
		return "update";
	}
	
	@RequestMapping("queryDept")
	public String queryDept(Model model) {
		List<Department> depts = departmentService.queryAll();
		model.addAttribute("depts", depts);
		return "add";
	}
	
	@RequestMapping(value = "addEmp", method=RequestMethod.POST)
	public String add (HttpServletRequest req) {
		String lastname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String birth = req.getParameter("birth");
		String dept = req.getParameter("dept");
		employeeService.add(new Employee(lastname,email,birth,new Date(),dept));
		return "redirect:showAll";
	}
	
	/*@RequestMapping("delEmp")
	public String delEmp(Integer id){
		employeeService.del(id);
		return "redirect:showAll";
	}*/
	
	@RequestMapping(value = "delEmp",method=RequestMethod.POST)
	@ResponseBody
	public String delEmp(@RequestParam(value="id") Integer id){
		int res = employeeService.del(id);
		String data = "" + res;
		System.out.println(data);
		return data;
	}
	
	@RequestMapping(value = "updateEmp", method=RequestMethod.POST)
	public String updateEmp (HttpServletRequest req) {
		String lastname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String birth = req.getParameter("birth");
		String dept = req.getParameter("dept");
		Employee employee = employeeService.queryById(Integer.valueOf(req.getParameter("lastname")));
		employee.setLastname(lastname);
		employee.setEmail(email);
		employee.setBirth(birth);
		employee.setDept(dept);
		employeeService.update(employee);
		return "redirect:showAll";
	}

}

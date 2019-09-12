package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee1", method = RequestMethod.GET)
	public Employee firstService(@RequestParam("id") int id) {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId(id);
		emp.setSalary(8000);
		return emp;
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public Employee secondService(@RequestBody Employee employee) {

		System.out.println("Inside POST Method");
		Employee emp = new Employee();
		emp.setName(employee.getName());
		emp.setDesignation(employee.getDesignation());
		emp.setEmpId(employee.getEmpId());
		emp.setSalary(employee.getSalary());
		return emp;
	}

}
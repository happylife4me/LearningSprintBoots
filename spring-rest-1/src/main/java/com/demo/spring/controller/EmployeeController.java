package com.demo.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.dao.Dao;
import com.demo.spring.dao.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	Dao objEmp;
	
	@RequestMapping(path="/emp", method=RequestMethod.GET, produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Employee getEmployee(){
		Employee e =  objEmp.getEmployeeById(100);
		return e;
	}
}

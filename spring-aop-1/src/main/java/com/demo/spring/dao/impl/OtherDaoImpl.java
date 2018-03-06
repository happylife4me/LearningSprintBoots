package com.demo.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.demo.spring.Dao;
import com.demo.spring.Employee;


@Repository
public class OtherDaoImpl implements Dao {

	@Override
	public String saveEmp(Employee e) {
		return "Using Other Class --> Emp Saved";
	}
	
	@Override
	public boolean deleteEmp(int empid) {
		return true;
	}
	
}

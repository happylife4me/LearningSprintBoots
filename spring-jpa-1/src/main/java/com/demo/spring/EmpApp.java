package com.demo.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.Dao;
import com.demo.spring.dao.Employee;

@Service("objEmp")
public class EmpApp {
	
	@Autowired
	private Dao objDao;	

	public String registerEmployee(int id, String name, String city, double sal)
	{
		return objDao.save(new Employee(id, name, city, sal));
	}
	
	public String deleteEmployee(int empid){
		return objDao.deleteEmp(empid);
	}
	
	public List<Employee> GetAllEmployess(){
		return objDao.listAllEmployee();
	}
	
	public Employee GetEmployeeDetails(int empId){
		return objDao.getEmployeeById(empId);
	}
	
	public String saveEmployeeList(List<Employee> emps){
		return objDao.saveList(emps);
	}
	
	
	
}

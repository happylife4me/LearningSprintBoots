package com.demo.spring.dao;

import java.util.List;

public interface Dao {
	public String save(Employee e);
	public String deleteEmp(int empId);
	public List<Employee>listAllEmployee();
	public Employee getEmployeeById(int empid);
	public String saveList(List<Employee> emps);
}

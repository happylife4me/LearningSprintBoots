package com.demo.spring;

public interface Dao {
	public String saveEmp(Employee e);
	
	public boolean deleteEmp(int empid);
}

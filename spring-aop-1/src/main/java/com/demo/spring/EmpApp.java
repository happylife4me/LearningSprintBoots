package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ObjEmp")
public class EmpApp {
	
	@Autowired
	@Qualifier("jdbcDaoImpl")
	private Dao objDao;	

	public String registerEmployee(int id, String name, String city, double sal)
	{
		return objDao.saveEmp(new Employee(id, name, city, sal));
	}
	
	
	public Boolean DeleteEmployee(int id)
	{
		System.out.println("Employee deleted");
		return objDao.deleteEmp(id);
	}
}

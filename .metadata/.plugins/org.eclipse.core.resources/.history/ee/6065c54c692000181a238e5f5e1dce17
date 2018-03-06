package com.demo.spring;

public class EmpApp {
	
	private Dao objDao;	
	
	public void setObjDao(Dao objDao) {
		this.objDao = objDao;
	}

	public String registerEmployee(int id, String name, String city, double sal)
	{
		return objDao.saveEmp(new Employee(id, name, city, sal));
	}
}

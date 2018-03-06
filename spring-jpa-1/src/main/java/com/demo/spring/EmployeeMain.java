package com.demo.spring;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.dao.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		int empid = 1276;
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpApp EmpObj = (EmpApp) ctx.getBean("objEmp");
		
		for(Employee e : EmpObj.GetAllEmployess())
		{
			System.out.println("Id : " + e.getEmpId() +  " Name : " + e.getName() + "  City: " + e.getCity()  + " Salary :  " + e.getSalary());
		}
		
		System.out.println("-------INSERT - Started--------------------");
		//System.out.println(EmpObj.registerEmployee(empid,"Jagadeesh", "Hyderabad", 65000));
		
		//EmpObj.deleteEmployee(empid);
		
		/*System.out.println("-------INSERT - Completed--------------------");
		System.out.println("\n");
		System.out.println("-------Get All Employess--------------------");
		for(Employee e : EmpObj.GetAllEmployess())
		{
			System.out.println("Id : " + e.getEmpId() +  " Name : " + e.getName() + "  City: " + e.getCity()  + " Salary :  " + e.getSalary());
		}
		System.out.println("\n");
		System.out.println("--------Get One Employee Details-------------------");
		Employee emp = EmpObj.GetEmployeeDetails(empid);
		if (emp != null)
		{
			System.out.println("Id : " + emp.getEmpId() +  " Name : " + emp.getName() + "  City: " + emp.getCity()  + " Salary :  " + emp.getSalary());
		}
		System.out.println("\n");
		System.out.println("---------Delete Employee By Id------------------");
		EmpObj.deleteEmployee(empid);
		System.out.println("---------------------------");
		System.out.println("\n");
		for(Employee e : EmpObj.GetAllEmployess())
		{
			System.out.println("Id : " + e.getEmpId() +  " Name : " + e.getName() + "  City: " + e.getCity()  + " Salary :  " + e.getSalary());
		}
		System.out.println("---------------------------");
		
		System.out.println("\n");
		
		
		System.out.println("--------List of Employess to DB-------------------");
		ArrayList<Employee> lstEmp = new ArrayList<>();
		lstEmp.add(new Employee(112, "Jagadeesh", "Hyderabad", 45000));
		lstEmp.add(new Employee(113, "Umadevi", "Secunderabad", 32500));
		lstEmp.add(new Employee(104, "Ruthvik", "Badvel", 528692));
		System.out.println(EmpObj.saveEmployeeList(lstEmp));
		System.out.println("---------------------------");*/
		
		
		
	}

}
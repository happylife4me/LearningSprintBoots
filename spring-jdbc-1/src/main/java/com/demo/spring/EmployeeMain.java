package com.demo.spring;

import java.io.Console;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpApp EmpObj = (EmpApp) ctx.getBean("objEmp");
		System.out.println(EmpObj.registerEmployee(1001,"Jagadeesh", "Hyderabad", 65000));
	}

}

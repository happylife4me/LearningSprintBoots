package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("\n\n\n\n\n");
		
		/*Dao objDeo = (Dao) ctx.getBean("hibDao");
		System.out.println(objDeo.saveEmp(new Employee(100, "Jagadeesh", "Hyderabad", 45000)));*/
		
		EmpApp objEmpApp = (EmpApp)ctx.getBean("ObjEmp");
		System.out.println(objEmpApp.registerEmployee(100, "Jagadeesh", "Hyderabad", 45000));
		System.out.println(objEmpApp.DeleteEmployee(100));
		
		Object  obj =  ctx.getBean("ObjEmp");
		System.out.println(obj.getClass().getName());
		

	}

}

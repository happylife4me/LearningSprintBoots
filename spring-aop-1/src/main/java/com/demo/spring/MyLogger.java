package com.demo.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {
	
	@Before("execution(* com.demo..EmpApp.*(..)) && args(id, name, city, sal)")
	public void logBefore(int id, String name, String city, double sal){
		System.out.println("Before method call ....." + id + " " + name + " " + city + " " + sal);
	}
	
	@AfterReturning(pointcut="execution(* com.demo..EmpApp.DeleteEmployee(..))", returning="returnValue")
	public boolean logAfter(boolean returnValue){
		System.out.println("After method call ....." + returnValue);
		return returnValue;
	}
}
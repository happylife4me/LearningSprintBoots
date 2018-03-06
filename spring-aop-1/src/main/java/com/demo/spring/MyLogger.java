package com.demo.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {
	
	@Before("execution(String com.demo..EmpApp1.registerEmployee(..))")
	public void logBefore(){
		System.out.println("Before method call .....");
	}
	
	@AfterReturning("execution(* com.demo..EmpApp1.DeleteEmployee(..))")
	public void logAfter(){
		System.out.println("After method call .....");
	}
}

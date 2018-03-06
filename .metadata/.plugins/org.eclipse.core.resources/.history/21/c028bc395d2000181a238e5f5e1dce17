package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailTesting {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		Mail objMail =(Mail) ctx.getBean("mailObj");
		Message objMsg = objMail.getMessage();
		
		System.out.println(objMail.getFromAddress());
		System.out.println(objMail.getToAddress());
		System.out.println(objMsg.getContent());
		System.out.println(objMsg.getHeader());

	}

}

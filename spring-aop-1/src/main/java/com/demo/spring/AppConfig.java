package com.demo.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.demo.spring.dao.impl.OtherDaoImpl;


@Configurable
@ComponentScan(basePackages = "com.demo.spring")
@EnableAspectJAutoProxy
public class AppConfig {
	
	@Bean
	public Dao hibDao(){
		return new OtherDaoImpl();
	}
}

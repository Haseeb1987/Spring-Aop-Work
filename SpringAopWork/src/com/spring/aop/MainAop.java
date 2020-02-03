package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.services.AopService;

public class MainAop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AopService aopService =  context.getBean("service", AopService.class);
		System.out.println(aopService.getStudent().getName());
	}

}

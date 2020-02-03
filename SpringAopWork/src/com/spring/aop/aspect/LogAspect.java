package com.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Before("allGet()")
	public void logAdvice(){
		System.out.println("This is the Aspect Advice !!!");
	}
	
	@Before("allSet()")
	public void secondAdvice(){
		System.out.println("This is the Second Aspect Advice !!!");
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGet(){}
	
	@Pointcut("within (com.spring.aop..*)")
	public void allSet(){}
	
}

package com.practice.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices form logging
	
	// let's start with an @Before advice
	
	@Pointcut("execution(* com.practice.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	//create pointcut for getter method
	@Pointcut("execution(* com.practice.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	// create pointcut for setter method
	@Pointcut("execution(* com.practice.aopdemo.dao.*.set*(..))")
	private void setter() {}
	
	// create point cut: include package.. exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNogetterSetter() {}
	
	@Before("forDaoPackageNogetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing before addAccount()");
	}
	
	@Before("forDaoPackageNogetterSetter()")
	public void performApiAnalytics() {
		System.out.println("=====>> Performing API analytics");
	}

}

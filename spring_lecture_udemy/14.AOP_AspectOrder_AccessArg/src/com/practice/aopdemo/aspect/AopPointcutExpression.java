package com.practice.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopPointcutExpression {

	@Pointcut("execution(* com.practice.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	//create pointcut for getter method
	@Pointcut("execution(* com.practice.aopdemo.dao.*.get*(..))")
	public void getter() {}
	
	// create pointcut for setter method
	@Pointcut("execution(* com.practice.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	// create point cut: include package.. exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNogetterSetter() {}
	
}

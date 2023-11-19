package com.practice.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.practice.aopdemo.Account;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
	
	// add a new advice for @afterThrowing on the findAccounts method
	
	@AfterThrowing(pointcut="execution(* com.practice.aopdemo.dao.AccountDAO.findAccounts(..))",
					throwing="exc")
	public void afterThrowingFindAccountAdvice(JoinPoint theJoinPoint , Throwable exc) {
		
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("In @AfterThrowing : " + method);
		// log the exception
		System.out.println("In @AfterThrowing : " + exc);
	}
	
	
}

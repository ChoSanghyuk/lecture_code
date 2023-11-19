package com.practice.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.practice.aopdemo.Account;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
	
	// add a new advice for @after on the findAccounts method
	@After("execution(* com.practice.aopdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
		// print out which method we are advising on
				String method = theJoinPoint.getSignature().toShortString();
				System.out.println("In @After : " + method);
	}
	
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

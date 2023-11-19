package com.practice.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
	
	// add a new advice for @afterReturning on the findAccounts method
	@AfterReturning(pointcut="execution(* com.practice.aopdemo.dao.AccountDAO.findAccounts(..))", 
					returning="result")
	public void afterReturningFindAccountsAdvice( JoinPoint theJoinPoint , List<Account> result) {
		
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("In @AfterReturning : " + method);
		// print out the results of the method call
		System.out.println("In @AfterReturning : " + result);
		
		// let's post-process the data ... let's modify it
		
		// convert the account names to upper case
		convertAccountNamesToUpperCase(result);
		System.out.println("In @AfterReturning : " + result);
	}

	private void convertAccountNamesToUpperCase(List<Account> result) {
		
		for(Account acc : result) {
			acc.setName(acc.getName().toUpperCase());
		}
		
	}
	
}

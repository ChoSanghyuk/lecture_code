package com.practice.aopdemo.aspect;


import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
	
	@Around("execution(* com.practice.aopdemo.service.*.getFortune())")
	public Object aroundGetFortune( ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
		
		// print out method we are advising on
		String method = theProceedingJoinPoint.getSignature().toShortString();
		System.out.println("In @Around : " + method);
		
		// get begin time stamp
		long begin = System.currentTimeMillis();
		
		// now, let's execute the method
		Object result = theProceedingJoinPoint.proceed();
		
		// get end time stamp
		long end = System.currentTimeMillis();
		
		// compute duration and display it
		long duration = end - begin;
		System.out.println("\nDuration: " + duration + "millis");
		
		return result;
	}
		
	@Around("execution(* com.practice.aopdemo.service.*.getFortune(boolean))")
	public Object aroundGetFortuneHandleException( ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
		
		// print out method we are advising on
		String method = theProceedingJoinPoint.getSignature().toShortString();
		System.out.println("In @Around : " + method);
		
		// now, let's execute the method
		Object result = null;
		
		try {
			result = theProceedingJoinPoint.proceed();
		} catch(RuntimeException e) {
			// log the exception
			System.out.println(e.getMessage());
			// give user a custom message
			result = "Major accident happend";
		}
				
		return result;
	}
}

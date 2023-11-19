package com.practice.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class) ;		
		
		// get the bean from spring container
		
		TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("\nIn Main");
		
		// profiling code
		System.out.println("\nProfiling code");
		String data = theFortuneService.getFortune();
		System.out.println("\nMy Fortune is : " + data);
		
		
		// Handling exception
		System.out.println("\nHandling Exception");
		boolean tripWire = true;
		String data2 = theFortuneService.getFortune(tripWire);
		System.out.println("\nMy Fortune is : " + data2);
		
		System.out.println("\n\n\nFinished");
		// close the context
		context.close();

	}

}

package com.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		//Coach theCoach = context.getBean("myCoach" , Coach.class);
		CricketCoach cricketCoach = context.getBean("myCricketCoach" , CricketCoach.class);
		// call methods on the bean
			
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmail());
		System.out.println(cricketCoach.getTeam());
		// close the context
		context.close();
		
		
	}

}

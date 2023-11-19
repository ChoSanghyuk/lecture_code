package com.practice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("theTennisCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("init method activated");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroy method activated");
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}

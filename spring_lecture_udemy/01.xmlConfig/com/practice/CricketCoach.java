package com.practice;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public CricketCoach() {
		System.out.println("Cricket Coach constructed");
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter generated");
		this.fortuneService = fortuneService;
	}
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

package com.practice;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService ;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach : method init") ; 
	}
	
	// add an destroy method
		public void doMyCleanUpStuff() {
			System.out.println("TrackCoach : method destroy") ; 
		}

}

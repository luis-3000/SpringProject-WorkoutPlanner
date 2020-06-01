package com.joselcastillo.workoutplanner;

public class CricketCoach implements Coach_Interface {
	
	private FortuneService_Interface fortuneService;

	/* Default constructor to fix issue with earlier prototype 
	 * in MyApp.java */
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	/* Setter method, called by Spring during setter injection */
	public void setFortuneService(FortuneService_Interface fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Your Cricket routine: Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "Your Cricket fortune says: " + fortuneService.getFortune();
	}

}

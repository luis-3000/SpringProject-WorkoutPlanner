package com.joselcastillo.workoutplanner;

public class BaseballCoach implements Coach_Interface {
	
	// Define a private field for the dependency
	private FortuneService_Interface fortuneService;
	
	/* Default constructor to fix issue with earlier prototype 
	 * in MyApp.java */
	public BaseballCoach() {
		
	}
	
	// Define a constructor for dependency injection
	public BaseballCoach(FortuneService_Interface theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Here's your baseball workout: spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return "Your baseball fortune says: " + fortuneService.getFortune();
	}
	
}

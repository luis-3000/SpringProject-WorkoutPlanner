package com.joselcastillo.workoutplanner;

public class BoxingCoach implements Coach_Interface {

	// Define a private field for the dependency
	private FortuneService_Interface fortuneService;

	/* Default constructor to fix issue with earlier prototype 
	 * in MyApp.java */
	public BoxingCoach() {
		
	}
	
	// Define a constructor for dependency injection
	public BoxingCoach(FortuneService_Interface theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Your boxing workout: sparr with several opponents for 3 hours daily ";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return "Your boxing fortune says: " + fortuneService.getFortune();
	}
	
}

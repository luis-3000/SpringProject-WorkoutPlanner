package com.joselcastillo.workoutplanner;

public class CyclingCoach implements Coach_Interface {

	// Define a private field for the dependency
	private FortuneService_Interface fortuneService;

	/* Default constructor to fix issue with earlier prototype 
	 * in MyApp.java */
	public CyclingCoach() {
		
	}
	
	// Define a constructor for dependency injection
	public CyclingCoach(FortuneService_Interface theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Your cycling workout: ride your bycicle up and down the hills for 4 hours";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return "Your cycling fortune says: " + fortuneService.getFortune();
	}
}

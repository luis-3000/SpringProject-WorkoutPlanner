package com.joselcastillo.workoutplanner;

public class BasketballCoach implements Coach_Interface {

	// Define a private field for the dependency
	private FortuneService_Interface fortuneService;

	/* Default constructor to fix issue with earlier prototype 
	 * in MyApp.java */
	public BasketballCoach() {
		System.out.println("BasketballCoach: inside no-arg constructor");
	}
	
	// Define a constructor for dependency injection
	public BasketballCoach(FortuneService_Interface theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Your basketball workout: shoot 1000 hoops";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return "Your basketball fortune says: " + fortuneService.getFortune();
	}

}

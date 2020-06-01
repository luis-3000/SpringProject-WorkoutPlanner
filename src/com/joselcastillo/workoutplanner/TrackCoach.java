package com.joselcastillo.workoutplanner;

public class TrackCoach implements Coach_Interface {

	// Define a private field for the dependency
	private FortuneService_Interface fortuneService;

	/* Default constructor to fix issue with earlier prototype 
	 * in MyApp.java */
	public TrackCoach() {
		System.out.println("TrackCoach: inside no-arg constructor");
	}
			
	// Define a constructor for dependency injection
	public TrackCoach(FortuneService_Interface fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Your track workout: Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return "Your track fortune says: " + fortuneService.getFortune();
	}
	
	// Add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside the method doMyStartupStuff()");
	}
	
	// Add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside the method doMyCleanupStuff()");
	}
	

}

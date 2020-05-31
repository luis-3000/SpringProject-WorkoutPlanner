package com.joselcastillo.workoutplanner;

public class BaseballCoach implements Coach_Interface {
	
	@Override
	public String getDailyWorkout() {
		return "Here's your baseball workout: spend 30 minutes on batting practice";
	}
	
}

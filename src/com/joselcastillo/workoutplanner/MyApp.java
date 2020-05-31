package com.joselcastillo.workoutplanner;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		Coach_Interface baseballCoach = new BaseballCoach();
		
		// use the object
		System.out.println(baseballCoach.getDailyWorkout());

		// create a new object type (track coach)
		Coach_Interface trackCoach = new TrackCoach();
	
		System.out.println(trackCoach.getDailyWorkout());
		
		
	}

}

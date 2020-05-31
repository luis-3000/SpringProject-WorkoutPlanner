package com.joselcastillo.workoutplanner;

public class MyApp {

	public static void main(String[] args) {
		
//		// create the object
//		Coach_Interface theCoach = new BaseballCoach();
//		
//		// use the object
//		System.out.println(theCoach.getDailyWorkout());

		// create a new object type (track coach)
		Coach_Interface theCoach = new TrackCoach();
	
		System.out.println(theCoach.getDailyWorkout());
		
		
	}

}

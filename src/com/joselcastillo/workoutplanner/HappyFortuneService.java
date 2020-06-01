package com.joselcastillo.workoutplanner;

/* Dependency class for the FortuneService interface. */
public class HappyFortuneService implements FortuneService_Interface {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}

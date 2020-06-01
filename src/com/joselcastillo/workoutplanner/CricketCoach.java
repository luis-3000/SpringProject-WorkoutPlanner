package com.joselcastillo.workoutplanner;

public class CricketCoach implements Coach_Interface {
	
	private FortuneService_Interface fortuneService;
	
	// Add new private fields for emallAddress and team to inject them as literal values
	private String emailAddress;
	private String team;

	/* Default constructor to fix issue with earlier prototype in MyApp.java */
	public CricketCoach() {
		System.out.println("CricketCoach: inside the no-arg constructor CricketCoach()");
	}
	
	/* Setter method, called by Spring during setter injection */
	public void setFortuneService(FortuneService_Interface fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService()");
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

	public String getEmailAddress() {
		return "The email address is: " + emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return "The team's name is: " + team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam()");
		this.team = team;
	}

	
}

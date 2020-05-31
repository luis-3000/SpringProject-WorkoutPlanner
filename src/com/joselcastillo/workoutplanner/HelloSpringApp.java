package com.joselcastillo.workoutplanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the Spring configuration file
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve a bean from the spring container
		Coach_Interface theCoach = appContext.getBean("myCoach", 
													Coach_Interface.class);
		
		// Then, call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the application context
		appContext.close();
		

	}

}

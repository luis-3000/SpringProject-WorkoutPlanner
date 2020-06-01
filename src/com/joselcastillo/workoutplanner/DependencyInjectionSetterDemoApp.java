package com.joselcastillo.workoutplanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionSetterDemoApp {

	public static void main(String[] args) {
		
		// Load the Spring configuration file
		ClassPathXmlApplicationContext appContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from the Spring container
		CricketCoach theCoach = appContext.getBean("myCricketCoach", CricketCoach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// Call the new methods to get the literal values
		System.out.println("Now showing some literal values previously injected ...");
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		// Close the application context
		appContext.close();
		
	}

}

/* SAMPLE OUTPUT:

Jun 01, 2020 12:11:40 AM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry getSingleton
FINE: Creating shared instance of singleton bean 'myFortuneService'
Jun 01, 2020 12:11:40 AM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry getSingleton
FINE: Creating shared instance of singleton bean 'myCoach'
Jun 01, 2020 12:11:40 AM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry getSingleton
FINE: Creating shared instance of singleton bean 'myCricketCoach'
CricketCoach: inside no-arg constructor
CricketCoach: inside setter method - setFortuneService
Your Cricket routine: Practice fast bowling for 15 minutes
Your Cricket fortune says: Today is your lucky day!
Jun 01, 2020 12:11:40 AM org.springframework.context.support.AbstractApplicationContext doClose
FINE: Closing org.springframework.context.support.ClassPathXmlApplicationContext@726f3b58, started on Mon Jun 01 00:11:40 CDT 2020

*/
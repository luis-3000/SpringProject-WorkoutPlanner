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
		System.out.println("Now, showing some literal values previously injected via the properties file...");
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		// Close the application context
		appContext.close();
		
	}

}

/* SAMPLE OUTPUT:

FINE: Creating shared instance of singleton bean 'myCoach'
Jun 01, 2020 12:37:04 PM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry getSingleton
FINE: Creating shared instance of singleton bean 'myCricketCoach'
CricketCoach: inside the no-arg constructor CricketCoach()
CricketCoach: inside setter method - setFortuneService()
CricketCoach: inside setter method - setEmailAddress()
CricketCoach: inside setter method - setTeam()
Your Cricket routine: Practice fast bowling for 15 minutes
Your Cricket fortune says: Today is your lucky day!
Now, showing some literal values previously injected via the properties file...
The email address is: josecastillocs@gmail.com
The team's name is: The Wingmakers from the 28th Century
Jun 01, 2020 12:37:04 PM org.springframework.context.support.AbstractApplicationContext doClose
FINE: Closing org.springframework.context.support.ClassPathXmlApplicationContext@726f3b58, started on Mon Jun 01 12:37:04 CDT 2020

*/
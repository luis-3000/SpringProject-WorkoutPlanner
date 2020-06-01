package com.joselcastillo.workoutplanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load the Spring configuration file
		ClassPathXmlApplicationContext appContext =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve the beans from the Spring container
		Coach_Interface theCoach = appContext.getBean("myCoach", Coach_Interface.class);
		
		Coach_Interface alphaCoach = appContext.getBean("myCoach", Coach_Interface.class);
		
		// Check if these are the same beans
		boolean areBeansTheSame = (theCoach == alphaCoach);
		
		// Print out the results of the comparisons between objects
		System.out.println("\nAre these beans pointing to the same object? " + 
						areBeansTheSame);
		
		System.out.println("\nConfirming that each bean is pointing to the same memory location: ");
		System.out.println("\nMemory location for theCoach bean: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach bean: " + alphaCoach);
		
		// Close the application context
		appContext.close();

	}

}

/* SAMPLE OUTPUT
 
Jun 01, 2020 2:40:06 PM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry getSingleton
FINE: Creating shared instance of singleton bean 'myFortuneService'
Jun 01, 2020 2:40:06 PM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry getSingleton
FINE: Creating shared instance of singleton bean 'myCoach'

Are these beans pointing to the same object? true

Confirming that each bean is pointing to the same memory location: 

Memory location for theCoach bean: com.joselcastillo.workoutplanner.BaseballCoach@4b5d6a01

Memory location for alphaCoach bean: com.joselcastillo.workoutplanner.BaseballCoach@4b5d6a01
Jun 01, 2020 2:40:06 PM org.springframework.context.support.AbstractApplicationContext doClose
FINE: Closing org.springframework.context.support.ClassPathXmlApplicationContext@726f3b58, started on Mon Jun 01 14:40:06 CDT 2020

*/
package com.joselcastillo.workoutplanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// Load the Spring configuration file
		ClassPathXmlApplicationContext appContext =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// Retrieve the bean from the Spring container
		Coach_Interface theCoach = appContext.getBean("myCoach", Coach_Interface.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the application context
		appContext.close();

	}

}

/* SAMPLE OUTPUT
 
Jun 01, 2020 3:32:38 PM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry getSingleton
FINE: Creating shared instance of singleton bean 'myFortuneService'
Jun 01, 2020 3:32:38 PM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry getSingleton
FINE: Creating shared instance of singleton bean 'myCoach'
TrackCoach: inside the method doMyStartupStuff()
Your track fortune says: Today is your lucky day!
Your track workout: Run a hard 5k
Jun 01, 2020 3:32:38 PM org.springframework.context.support.AbstractApplicationContext doClose
FINE: Closing org.springframework.context.support.ClassPathXmlApplicationContext@726f3b58, started on Mon Jun 01 15:32:37 CDT 2020
TrackCoach: inside the method doMyCleanupStuff()

*/
package com.luv2code.springdemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read Spring Config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from the container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// Call methods on the Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();
		
	}

}

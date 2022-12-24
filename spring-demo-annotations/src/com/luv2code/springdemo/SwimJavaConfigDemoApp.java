package com.luv2code.springdemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read Spring Config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from the container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// Call methods on the Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Props Values Injected @Value annotation
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		// Close the context
		context.close();
		
	}

}

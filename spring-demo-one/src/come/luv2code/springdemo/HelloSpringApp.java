package come.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retreive a bean from Spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		// Call Methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Call the Fortune Method
		System.out.println(theCoach.getDailyFortune());
		
		// Close the Context
		context.close();

	}

}

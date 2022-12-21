package come.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAppDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are the same bean (the same reference)
		boolean result = theCoach.equals(alphaCoach);
		
		System.out.println("\npointing to the same object: " + result);
		
		System.out.println("\npMemory location for theCoach: " + theCoach);
		
		System.out.println("\npMemory location for alphaCoach: " + alphaCoach);
		
		context.close();
		

	}

}

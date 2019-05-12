package io.karanthaker.spring.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

  public static void main(String[] args) {

    // Load Spring configuration file.
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "beanScope-applicationContext.xml");

    // Retrieve bean from Spring container.
    Coach coach = context.getBean("coach", Coach.class);
    Coach alphaCoach = context.getBean("coach", Coach.class);

    // Check if they are the same beans.
    boolean result = (coach == alphaCoach);

    // Print results.
    System.out.println("\nPointing to the same object: " + result);
    System.out.println("\nMemory location for coach: " + coach);
    System.out.println("\nMemory location for alpha coach: " + alphaCoach);

    // Close the context.
    context.close();
  }

}

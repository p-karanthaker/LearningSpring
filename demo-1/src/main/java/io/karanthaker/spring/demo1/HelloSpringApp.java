package io.karanthaker.spring.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

  public static void main(String[] args) {

    // Load the Spring configuration file.
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    // Retrieve a bean from the Spring container.
    Coach coach = context.getBean("coach", Coach.class);

    // Call methods on bean.
    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.getDailyFortune());

    // Close the context.
    context.close();
  }

}

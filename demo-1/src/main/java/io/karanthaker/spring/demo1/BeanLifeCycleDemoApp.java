package io.karanthaker.spring.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

  public static void main(String[] args) {

    // Load Spring configuration file.
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "beanLifeCycle-applicationContext.xml");

    // Retrieve bean from Spring container.
    Coach coach = context.getBean("coach", Coach.class);

    System.out.println(coach.getDailyWorkout());

    // Close the context.
    context.close();
  }

}

package io.karanthaker.spring.demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

  public static void main(String[] args) {

    // Read the Spring config file.
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    // Get the bean from the Spring container.
    Coach coach = context.getBean("tennisCoach", Coach.class);
    Coach anotherCoach = context.getBean("basketballCoach", Coach.class);

    // Call a method on the bean.
    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.getDailyFortune());

    System.out.println(anotherCoach.getDailyWorkout());
    System.out.println(anotherCoach.getDailyFortune());

    // Close the context.
    context.close();
  }

}

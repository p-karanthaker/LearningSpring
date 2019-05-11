package io.karanthaker.spring.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

  public static void main(String[] args) {

    // Load Spring configuration file.
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    // Retrieve bean from Spring container.
    CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);

    // Call methods on the bean.
    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.getDailyFortune());
    System.out.println(coach.getEmailAddress());
    System.out.println(coach.getTeam());
    // Close the context.
    context.close();

  }

}

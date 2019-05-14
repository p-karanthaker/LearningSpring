package io.karanthaker.spring.demo2;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Do 50 suicides.";
  }

}

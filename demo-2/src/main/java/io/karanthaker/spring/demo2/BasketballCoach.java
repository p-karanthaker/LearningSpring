package io.karanthaker.spring.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

  private FortuneService fortuneService;

  @Autowired
  public BasketballCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Do 50 suicides.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

}

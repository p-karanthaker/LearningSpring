package io.karanthaker.spring.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  @Autowired
  @Qualifier("databaseFortuneService")
  private FortuneService fortuneService;

  /*@Autowired
  public TennisCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }*/

  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

}

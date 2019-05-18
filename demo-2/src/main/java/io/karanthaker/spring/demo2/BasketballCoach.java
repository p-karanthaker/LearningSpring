package io.karanthaker.spring.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

  private FortuneService fortuneService;

  public BasketballCoach() {
    System.out.println(">> BasketballCoach: inside default constructor");
  }

  /*@Autowired
  public void setFortuneService(FortuneService fortuneService) {
    System.out.println(">> BasketballCoach: inside setFortuneService() method");
    this.fortuneService = fortuneService;
  }*/

  @Autowired
  public void doSomeCrazyStuff(FortuneService fortuneService) {
    System.out.println(">> BasketballCoach: inside doSomeCrazyStuff() method");
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

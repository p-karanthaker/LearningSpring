package io.karanthaker.spring.demo1;

public class LiftingCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Do bicep curls.";
  }

  @Override
  public String getDailyFortune() {
    return null;
  }

}

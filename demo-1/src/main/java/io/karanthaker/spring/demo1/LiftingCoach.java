package io.karanthaker.spring.demo1;

public class LiftingCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Do bicep curls.";
  }
}

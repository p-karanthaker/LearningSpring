package io.karanthaker.spring.demo1;

public class TrackCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k.";
  }
}

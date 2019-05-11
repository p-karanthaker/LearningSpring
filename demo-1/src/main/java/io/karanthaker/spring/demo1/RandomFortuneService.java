package io.karanthaker.spring.demo1;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

  private static final String[] fortunes = {
      "Today is your lucky day!",
      "Things aren't looking so good today.",
      "Who know what will happen today?"
  };

  @Override
  public String getFortune() {
    int random = new Random().nextInt(fortunes.length);
    return fortunes[random];
  }
}

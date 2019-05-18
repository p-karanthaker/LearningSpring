package io.karanthaker.spring.demo2;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

  private final String[] fortunes = {
      "Good fortune.",
      "Bad fortune.",
      "Who knows?"
  };

  @Override
  public String getFortune() {
    int random = new Random().nextInt(fortunes.length);
    return fortunes[random];
  }

}

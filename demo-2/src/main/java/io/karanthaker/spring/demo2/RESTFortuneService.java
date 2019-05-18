package io.karanthaker.spring.demo2;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

  @Override
  public String getFortune() {
    return "REST fortune.";
  }

}

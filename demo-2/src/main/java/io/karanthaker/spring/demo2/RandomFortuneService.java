package io.karanthaker.spring.demo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component
public class RandomFortuneService implements FortuneService {

  private final List<String> fortunes;

  public RandomFortuneService() throws FileNotFoundException {
    fortunes = new LinkedList<>();
    File theFile = ResourceUtils.getFile("classpath:fortunes.txt");
    Scanner scanner = new Scanner(theFile);

    while (scanner.hasNext()) {
      fortunes.add(scanner.nextLine());
    }
  }

  @Override
  public String getFortune() {
    int random = new Random().nextInt(fortunes.size());
    return fortunes.get(random);
  }

}

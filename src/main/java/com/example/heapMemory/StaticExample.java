package com.example.heapMemory;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StaticExample {

  public static List<Double> staticExampleList = new ArrayList<>();

  public void staticExample(){
    log.info("Debug Point 1");
    new StaticExample().populateList();
    log.info("Debug Point 3");
  }

  public void populateList() {
    for (int i = 0; i < 10000000; i++) {
      staticExampleList.add(Math.random());
    }
    log.info("Debug Point 2");
  }

}

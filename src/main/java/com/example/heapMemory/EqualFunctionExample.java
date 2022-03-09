package com.example.heapMemory;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EqualFunctionExample {



  public void givenMap() {
    Map<Person, Integer> map = new HashMap<>();
    for(int i=0; i<10000000; i++) {
      map.put(new Person("jon"), 1);
    }
    log.info("size of map is {}",map.size());
  }

}

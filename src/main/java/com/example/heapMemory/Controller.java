package com.example.heapMemory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/example")
public class Controller {

  @Autowired
  private StaticExample staticExample;

  @Autowired
  private EqualFunctionExample equalFunctionExample;

  @RequestMapping(value = "/static", method = RequestMethod.GET)
  public void staticExample() {
    staticExample.staticExample();
  }

  @RequestMapping(value = "/equal_function", method = RequestMethod.GET)
  public void equalFunctionExample() {
    equalFunctionExample.givenMap();
  }

}

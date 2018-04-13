package com.dft.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dft.service.HelloService;

/**
 * @Class Name HelloController
 * @Author dongfuting
 * @Create In 2018年04月13日 16:38
 */
@RestController
public class HelloController {

  @Autowired
  HelloService helloService;

  @RequestMapping(value = "/hi")
  public String hi(@RequestParam String name) {
    return helloService.hiService(name);
  }
}

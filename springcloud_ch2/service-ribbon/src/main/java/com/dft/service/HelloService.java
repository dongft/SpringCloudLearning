package com.dft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Class Name HelloService
 * @Author dongfuting
 * @Create In 2018年04月13日 16:39
 */
@Service
public class HelloService {

  @Autowired
  RestTemplate restTemplate;

  public String hiService(String name) {
    return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
  }
}

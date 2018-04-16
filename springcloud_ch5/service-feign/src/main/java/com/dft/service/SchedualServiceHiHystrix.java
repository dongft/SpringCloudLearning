package com.dft.service;

import org.springframework.stereotype.Component;

/**
 * @Class Name SchedualServiceHiHystrix
 * @Author dongfuting
 * @Create In 2018年04月16日 11:20
 */
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {

  @Override public String sayHiFromClient(String name) {
    return "sorry " + name;
  }
}

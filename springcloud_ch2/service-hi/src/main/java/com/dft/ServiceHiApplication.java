package com.dft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class Name ServiceHiApplication
 * @Author dongfuting
 * @Create In 2018年04月12日 17:34
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServiceHiApplication.class, args);
  }

  @RequestMapping("/hi")
  public String hi() {
    return "hi";
  }
}

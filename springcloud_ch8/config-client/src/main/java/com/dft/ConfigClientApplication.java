package com.dft;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class Name ConfigClientApplication
 * @Author dongfuting
 * @Create In 2018年04月17日 20:14
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
@RefreshScope
public class ConfigClientApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigClientApplication.class, args);
  }

  @Value("${foo}")
  String foo;

  @RequestMapping(value = "/hi")
  public String hi() {
    return foo;
  }
}

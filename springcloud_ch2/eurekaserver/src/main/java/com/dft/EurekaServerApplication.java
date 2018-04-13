package com.dft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Class Name EurekaServerApplication
 * @Author dongfuting
 * @Create In 2018年04月13日 14:29
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(EurekaServerApplication.class, args);
  }
}

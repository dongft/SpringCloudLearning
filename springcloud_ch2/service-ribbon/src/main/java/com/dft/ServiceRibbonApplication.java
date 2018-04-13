package com.dft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Class Name ServiceRibbonApplication
 * @Author dongfuting
 * @Create In 2018年04月13日 16:35
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceRibbonApplication {
  public static void main(String[] args) {
    SpringApplication.run(ServiceRibbonApplication.class, args);
  }

  @Bean
  @LoadBalanced
  RestTemplate restTemplate() {
    return new RestTemplate();
  }
}

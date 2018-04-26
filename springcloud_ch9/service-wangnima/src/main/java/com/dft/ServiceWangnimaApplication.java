package com.dft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

/**
 * @Class Name ServiceHiApplication
 * @Author dongfuting
 * @Create In 2018年04月26日 22:19
 */
@SpringBootApplication
@RestController
public class ServiceWangnimaApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServiceWangnimaApplication.class, args);
  }

  private static final Logger logger = Logger.getLogger(ServiceWangnimaApplication.class.getName());

  @Autowired
  private RestTemplate restTemplate;

  @Bean
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

  @RequestMapping("/hi")
  public String home() {
    logger.info("hi is being called");
    return "hi i'm wangnima";
  }

  @RequestMapping("/wangnima")
  public String info() {
    logger.info("info is being called");
    return restTemplate.getForObject("http://localhost:8988/info", String.class);
  }

}

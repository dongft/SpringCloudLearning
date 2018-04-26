package com.dft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
public class ServiceHiApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServiceHiApplication.class, args);
  }

  private static final Logger logger = Logger.getLogger(ServiceHiApplication.class.getName());

  @Autowired
  private RestTemplate restTemplate;

  @Bean
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

  @RequestMapping("/hi")
  public String callHome() {
    logger.info("calling trace service-hi ");
    return restTemplate.getForObject("http://localhost:8989/wangnima", String.class);
  }

  @RequestMapping("/info")
  public String info() {
    logger.info("calling trace service-hi ");
    return "i'm service-hi";
  }

  @Bean
  public AlwaysSampler defaultSampler() {
    return new AlwaysSampler();
  }
}

package com.dft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Class Name ServiceFeignApplicaiton
 * @Author dongfuting
 * @Create In 2018-04-16 0:24
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ServiceFeignApplicaiton {
    public static void main(String... args) {
        SpringApplication.run(ServiceFeignApplicaiton.class, args);
    }
}

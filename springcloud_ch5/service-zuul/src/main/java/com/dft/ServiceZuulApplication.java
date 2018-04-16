package com.dft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Class Name ServiceZuulApplication
 * @Author dongfuting
 * @Create In 2018-04-16 22:40
 */
@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
public class ServiceZuulApplication {
    public static void main(String... args) {
        SpringApplication.run(ServiceZuulApplication.class,args);
    }
}

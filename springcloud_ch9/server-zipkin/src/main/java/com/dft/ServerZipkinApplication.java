package com.dft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @Class Name ServerZipkinApplication
 * @Author dongfuting
 * @Create In 2018年04月26日 21:44
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {
  public static void main(String[] args) {
    SpringApplication.run(ServerZipkinApplication.class, args);
  }
}

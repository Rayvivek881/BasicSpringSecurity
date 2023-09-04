package com.rayvivek881.basicsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class BasicSecurityApplication {
  public static void main(String[] args) {
    SpringApplication.run(BasicSecurityApplication.class, args);
    System.out.println("server is running on http://localhost:8080/");
  }
}

package com.example.swb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SwbEurekaServer9081Application {

    public static void main(String[] args) {
        SpringApplication.run(SwbEurekaServer9081Application.class, args);
    }

}

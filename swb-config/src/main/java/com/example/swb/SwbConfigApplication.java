package com.example.swb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableConfigServer
@SpringBootApplication
@EnableEurekaServer
public class SwbConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwbConfigApplication.class, args);
    }

}

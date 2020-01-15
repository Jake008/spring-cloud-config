package com.example.swb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SwbEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwbEurekaServerApplication.class, args);
    }

}

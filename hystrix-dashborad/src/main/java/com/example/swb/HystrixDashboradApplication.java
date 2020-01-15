package com.example.swb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboradApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboradApplication.class, args);
    }

}

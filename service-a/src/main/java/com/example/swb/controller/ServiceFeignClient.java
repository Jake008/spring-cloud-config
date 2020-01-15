package com.example.swb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVICE-OBJCAT-B") //要调用的微服务名字
public interface ServiceFeignClient {
    @RequestMapping("/hello")
     String hello();
}


package com.example.swb.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static javafx.scene.input.KeyCode.R;

public class UserController {

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "getFeignPower")
    public String hello() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "我是服务器";
    }
    //服务降级方法
    public String getFeignPower(
    ) {
        return "服务器繁忙";
    }
}


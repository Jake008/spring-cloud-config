package com.example.swb.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "fallback")
    public String hello() {
       /* try {
            //延时1.5秒，测试feign的响应时间
           // Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
       int i = 10/0;
        //return "hello world, i am server-b";
        return "hello world,my port is:" + port;
    }

    @RequestMapping("/otherService")
    public String otherService() {
        return "我是其他服务";
    }
    String fallback(){
        return "服务器繁忙";
    }
}

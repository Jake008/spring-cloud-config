package com.example.swb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private ServiceFeignClient serviceFeignClient; //ribbon Feign的形式调用其他服务,默认方式是轮训
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/call")
    public String call() {
        String result = serviceFeignClient.hello();
        return "调用a的结果是:" + result;
    }

    @RequestMapping("/call01")
    public String call02() {
       restTemplate.getForObject("http://192.168.3.7:8086/hello",String.class);
        return "调用a的结果是:66666" ;
    }

}

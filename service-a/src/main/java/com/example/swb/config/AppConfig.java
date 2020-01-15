package com.example.swb.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean
   // @LoadBalanced  //这是个负载均衡注解
    public RestTemplate restTemplate() {
        return  new RestTemplate();
    }
    //ribbon负载均衡默认是轮循的方式，我们可以自己修改
    @Bean
    public IRule iRule() {
        return new RandomRule(); //随机访问
    }
}

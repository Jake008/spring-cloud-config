package com.example.swb;


//import com.example.swb.com.swb.filter.TokenFilter;
import com.example.swb.com.swb.filter.PasswordFilter;
import com.example.swb.com.swb.filter.PostFilter;
import com.example.swb.com.swb.filter.TokenFilter;
import com.example.swb.com.swb.filter.UserNameFilter;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

    @Bean
    TokenFilter tokenFilter1() {
        return new TokenFilter();
    }

   @Bean
    UserNameFilter userNameFilter1() {
       return new UserNameFilter();
   }

    @Bean
    PasswordFilter passwordFilter1() {
        return new PasswordFilter();
    }

    @Bean
    PostFilter postFilter1() {
        return new PostFilter();
    }
}

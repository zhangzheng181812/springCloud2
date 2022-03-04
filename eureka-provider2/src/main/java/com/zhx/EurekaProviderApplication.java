package com.zhx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangzheng on 2021/10/14.
 */
@SpringBootApplication
@EnableEurekaClient
@RequestMapping("/provider")
@RestController
public class EurekaProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class,args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/sayHI")
    public String sayHi(){
        return "Hi~"+"---"+port+"---";
    }

}

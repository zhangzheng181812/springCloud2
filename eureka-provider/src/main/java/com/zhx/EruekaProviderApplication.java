package com.zhx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangzheng on 2021/10/13.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/provider")
public class EruekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EruekaProviderApplication.class,args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/sayHI")
    public String sayHi(){
        return "Hi1~"+"---"+port+"---";
    }
}

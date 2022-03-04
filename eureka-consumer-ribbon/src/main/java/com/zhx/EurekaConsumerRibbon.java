package com.zhx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhangzheng on 2021/10/13.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/consumer-ribbon")
public class EurekaConsumerRibbon {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbon.class,args);
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/sayHi")
    public String sayHi(){
        return restTemplate.getForObject("http://eureka-provider/provider/sayHI", String.class);
    }
}

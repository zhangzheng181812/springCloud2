package com.zhx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public  static void  main(String[] z){

        /*启动参数必须加String[] z，命令行传参是用的这个*/
        SpringApplication.run(EurekaServerApplication.class,z);
    }
    
}

package com.zhx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by zhangzheng on 2021/10/13.
 1. @SpringBootApplication
 spring-boot 注解，相当于 @Configuration + @EnableAutoConfiguration + @ComponentScan
 @EnableAutoConfiguration -> AutoConfigurationImportSelector  会加载 META-INF/spring.factories 中指定的组件
 这里应用了 SPI 协议

 2. @EnableEurekaServer
 完成注册中心功能
* */
@SpringBootApplication
@EnableEurekaServer
public class EruekaServerApplication {

    public  static void  main(String[] z){

        /*启动参数必须加String[] z，命令行传参是用的这个*/
        SpringApplication.run(EruekaServerApplication.class,z);
    }
    
}

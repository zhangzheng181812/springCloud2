package com.zhx.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class RibboConfig {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule ribbonRule(){
//        return new RandomRule();//随机分配
        return new RoundRobinRule();//轮询
//        return new RetryRule();//RoundRobinRule 重试
//        return new BestAvailableRule();//最低并发
//        return new AvailabilityFilteringRule();//过滤少选
//        return new WeightedResponseTimeRule();//响应时间加权
//        return new ZoneAvoidanceRule();//区域权衡
    }
}

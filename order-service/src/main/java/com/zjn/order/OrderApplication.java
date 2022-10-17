package com.zjn.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zjn
 * @date 2022/10/16 上午11:12
 * EnableFeignClients 开启feign
 * basePackages 解决 A component required a bean of type 'com.zjn.feign.clients.UserClient' that could not be found.问题
 */
@SpringBootApplication
@MapperScan("com.zjn.order.mapper")
@EnableFeignClients(basePackages = "com.zjn.feign.clients")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    /**
     * @return
     * @LoadBalanced eureka 负载均衡
     * @author zjn
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

package com.example.springbootservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@RefreshScope   //开启配置更新功能
@SpringBootApplication
@EnableFeignClients
public class SpringbootConsumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumerServiceApplication.class, args);
    }

}

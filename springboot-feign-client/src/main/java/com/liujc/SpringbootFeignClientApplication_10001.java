package com.liujc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class SpringbootFeignClientApplication_10001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFeignClientApplication_10001.class, args);
    }

}

package com.liujcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DashboardApplication_11001 {
    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication_11001.class, args);
    }
}

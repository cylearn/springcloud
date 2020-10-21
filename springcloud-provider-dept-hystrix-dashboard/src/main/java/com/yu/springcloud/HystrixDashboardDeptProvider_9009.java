package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

//启动类
@SpringBootApplication
@EnableHystrixDashboard//开启
public class HystrixDashboardDeptProvider_9009 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardDeptProvider_9009.class,args);
    }

}

package com.xj.ojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.xj.ojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.xj")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xj.ojbackendserviceclient.service"})
public class ojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ojBackendUserServiceApplication.class, args);
    }

}

package com.liuio.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liuio.mapper")
public class ServiceProviderMain {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderMain.class);
            System.out.println("生产者启动=================");

    }
}

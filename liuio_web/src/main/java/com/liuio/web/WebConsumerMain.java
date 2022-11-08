package com.liuio.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(WebConsumerMain.class);
        System.out.println("消费者启动-----------------");
    }
}

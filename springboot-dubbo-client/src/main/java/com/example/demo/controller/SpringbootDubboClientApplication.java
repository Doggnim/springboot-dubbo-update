package com.example.demo.controller;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author Chuming Huang
 * @Date 2020/8/21
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDubbo
public class SpringbootDubboClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboClientApplication.class, args);
    }
}

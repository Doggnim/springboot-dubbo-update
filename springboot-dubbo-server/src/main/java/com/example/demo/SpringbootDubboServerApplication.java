package com.example.demo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Chuming Huang
 * @Date 2020/8/21
 */
@SpringBootApplication
@EnableDubbo
@MapperScan("com.example.demo.dao")
public class SpringbootDubboServerApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringbootDubboServerApplication.class, args);
        Thread.sleep(Long.MAX_VALUE);
    }
}

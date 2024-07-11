package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

//        System.getProperties().put("proxySet", true);
//        System.getProperties().put("socksProxyHost", "127.0.0.1");
//        System.getProperties().put("socksProxyPort", "7890");

        SpringApplication.run(DemoApplication.class, args);
    }

}

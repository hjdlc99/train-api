package com.train.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages ={"com.train.service","com.train.manager","com.train.web"})
@MapperScan("com.train.dao.mapper")
public class TrainWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainWebApplication.class, args);
    }

}

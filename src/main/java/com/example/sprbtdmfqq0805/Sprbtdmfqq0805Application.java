package com.example.sprbtdmfqq0805;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.sprbtdmfqq0805.dao")
@ComponentScan("com.example")
public class Sprbtdmfqq0805Application {

    public static void main(String[] args) {
        SpringApplication.run(Sprbtdmfqq0805Application.class, args);
    }

}

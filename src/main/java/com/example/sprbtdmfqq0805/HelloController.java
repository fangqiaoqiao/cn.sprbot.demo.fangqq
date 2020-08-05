package com.example.sprbtdmfqq0805;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")

    public String hello() {
        System.out.print("Hello Spring Boot!");
        System.out.print("Hello Spring Boot!");
        return "Hello Spring Boot!";
    }

}

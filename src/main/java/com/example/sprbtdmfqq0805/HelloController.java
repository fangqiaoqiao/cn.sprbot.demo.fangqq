package com.example.sprbtdmfqq0805;

import com.example.sprbtdmfqq0805.service.impl.UrUserfavInfoDealImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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


    @Autowired
    private UrUserfavInfoDealImpl urUserfavInfoDealImpl;
    @RequestMapping("/urUserfavInfo/{favinsId}")
    public String getUrUserfavInfo(@PathVariable String favinsId) {
        return urUserfavInfoDealImpl.getActInfo(favinsId);
    }

}

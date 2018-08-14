package com.eureka.client.clientwo.clienttwo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${name}")
    private String name;
    @Value("${info}")
    private String info;

    @RequestMapping("/getName")
    public String getName(){
        return "hello "+name+" info:"+info;
    }

}

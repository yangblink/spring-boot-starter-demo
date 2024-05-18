package com.example.mytest;

import org.example.HelloProperties;
import org.example.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    HelloService helloService;

    @GetMapping("/test")
    public String test() {
        HelloProperties helloProperties = helloService.getHelloProperties();
        return helloProperties.getSuffix();
//        return "test";
    }
}

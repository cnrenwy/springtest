package com.ruolan.springtest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    private String index(){
        return "hello world，this is ok1";
    }
}
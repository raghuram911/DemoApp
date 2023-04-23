package com.nuri.DemoApp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${appenv:}")
    private String appenv;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, " + appenv + "world!"
    }
}
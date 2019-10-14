package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/get")
    public String hello(){
        return "success";
    }

    @RequestMapping("/get2")
    public String hello2(){
        return "hello world";
    }
}

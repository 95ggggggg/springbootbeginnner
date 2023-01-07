package com.gzero.springbootbeginnner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @RequestMapping(value = "/hello", method = RequestMethod.GET) // 기존의 방식
    @GetMapping("hello")
    public String hello() {
        return "Hello World!";
    }

}


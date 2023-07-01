package com.docker.example.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@ControllerAdvice
public class DemoController {

    @GetMapping("/index")
    public String getMessage(){
        return "hello world";
    }
    @GetMapping("/")
    public String getWelcome(){
        return "welcome";
    }
}

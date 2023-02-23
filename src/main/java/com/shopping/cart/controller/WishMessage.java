package com.shopping.cart.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/jenkins")
@Slf4j
public class WishMessage {
    @GetMapping("/wish")
    public String getMsg() {
        String user = "Mohit";
        log.info("Inside the WishMessageController getMsg method");
        LocalDateTime ldt = LocalDateTime.now();
        log.info("Inside the WishMessageController2222 getMsg method");
        int hour = ldt.getHour();
        if (hour < 12)
            return "Good Morning" + user;
        else if (hour < 16)
            return "Good Afternoon" + user;
        else if (hour < 20)
            return "Good Evenining " + user;
        else
            return "Good Night " + user;
    }
    @GetMapping("/jenkins")
    public String hello(){
        return "Spring-Jenkins";
    }

    @GetMapping("/jenkins1")
    public String hello1(){
        return "Spring-Jenkins";
    }
}

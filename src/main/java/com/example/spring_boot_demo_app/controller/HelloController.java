package com.example.spring_boot_demo_app.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        String message = "Hello World";
        return message;
    }

    @GetMapping("/id")
    public int getId() {
        return 1;
    }

    @GetMapping("/id/list")
    public List<Integer> getIdList() {
        List<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(2);
        idList.add(3);
        idList.add(5);
        return idList;
    }


}

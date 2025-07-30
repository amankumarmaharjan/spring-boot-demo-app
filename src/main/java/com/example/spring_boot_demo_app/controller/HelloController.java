package com.example.spring_boot_demo_app.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
//        String message = "Hello World";
        String message = new String("Hello World");
        return message;
    }

    @GetMapping("/id")
    public int getId() {
        int id = 1;
        return id;
    }

    @GetMapping("/id/list")
    public List getIdList() {
        List<Integer> idList = new ArrayList<>();
        idList.add(1);//0
        idList.add(2);//1
        idList.add(3);//2
        idList.add(5);//3
        return idList;
    }
//    1|2|3|5
//    0 1 2 3

}

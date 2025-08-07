package com.example.spring_boot_demo_app.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;
//object=method+fields
// object= function+variables
//class= template/blue print
//object= actual

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/id")
    public int getId() {
        int id = 1;
        return id;
    }

    @GetMapping("/id/list")
    public List<Integer> getIdList() {
        List<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(2);
        idList.add(3);
        return idList;
    }


}


package com.example.spring_boot_demo_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class FunctionOverloadingExampleController {

    @GetMapping("/user")
    public int getUser(@RequestParam int id) {
        return id;
    }


    @GetMapping("/user/{id}")
    public String getUser(@PathVariable String id) {
        return id;
    }


}

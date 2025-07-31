package com.example.spring_boot_demo_app;

import com.example.spring_boot_demo_app.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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
        int id=1;
        return id;
    }

    @GetMapping("/id/list")
    public List<Integer> getIdList() {
        List<Integer> idList=new ArrayList<>();
        idList.add(1);
        idList.add(2);
        idList.add(3);
        return idList;
    }

    @GetMapping("/employee")
    public Employee getEmployee() {

        Employee employee1=new Employee();
        employee1.setId(1);
        employee1.setName("Arjun");

        System.out.println("Employee ID: "+employee1.getId());
        System.out.println("Employee Name: "+employee1.getName());

        return employee1;
    }

}


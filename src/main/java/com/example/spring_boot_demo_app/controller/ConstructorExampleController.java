package com.example.spring_boot_demo_app.controller;

import com.example.spring_boot_demo_app.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ConstructorExampleController {
 //constuctor sameclassname functiohn (object) creation only
//costructor overloading
//tostring

    @GetMapping("/constructor/employee")
    public Employee getEmployee() {

        Employee employee5=null;

        Employee employee1 = new Employee(1,"Arjun");
        Employee employee2 = new Employee(2);
        Employee employee3 = new Employee();
        Employee employee4 = new Employee(2, "aman", "maharjan");

//        employee5= new Employee(5,"XYZ");
        System.out.println(employee5);
        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2.getName()+ "id:"+employee2.getId());
        System.out.println("Employee 3: " + employee3);
        System.out.println("Employee 4: " + employee4);
        System.out.println(1);

        employee3.setId(6);

        System.out.println(employee4);

        return employee4;
    }
}

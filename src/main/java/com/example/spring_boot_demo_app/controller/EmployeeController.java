package com.example.spring_boot_demo_app.controller;

import com.example.spring_boot_demo_app.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

//    @GetMapping("/employee")
//    public Employee getEmployee() {
//
//        Employee employee1 = new Employee();
//        employee1.setId(1);
//        employee1.setName("Aman");
//
//        System.out.println("Employee ID: " + employee1.getId());
//        System.out.println("Employee Name: " + employee1.getName());
//
//        return checkName(employee1);
//    }

//    private static Employee checkName(Employee employee) {

    /// /        if (employee.getName().equals("Arjun")) {
    /// /            return changeName(employee);
    /// /        } else {
    /// /            return employee;
    /// /        }
    /// /         ternary operator
//        return employee.getName().equals("Arjun") ? changeName(employee) : employee;
//    }

//    private static Employee changeName(Employee employee2) {
//        employee2.setName(employee2.getName() + " " + "Baniya");
//        System.out.println("Employee Name: " + employee2.getName());
//        return employee2;
//    }
//    @PostMapping("/employee/add")
//    public Employee addEmployee(@RequestBody Employee employee) {
//        return checkName(employee);
//    }
    @PostMapping("/employee/changeName")
    public String getchangeDEmployeeName(@RequestBody Employee employee) {
        String finalName;
        if (employee.getLastName() == null) {
            finalName = changeName(employee, "Baniya");
        } else {
            finalName = changeName(employee);

        }
        return finalName;
    }


    private String changeName(Employee employee, String lastName) {
        return employee.getName() + lastName;
    }

    private String changeName(Employee employee) {
        return changeName(employee, employee.getLastName());
    }


}

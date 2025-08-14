package com.example.spring_boot_demo_app.model;

public class Employee {
    //fields attributes
    private int id;

    private String name;

    private String lastName;

    public Employee(int id, String arjun) {
        this.id = id;
        this.name = arjun;
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee() {

    }

    public Employee(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    //method
    public void setId(int idOut) {
        this.id = idOut;
    }

    public int getId() {

        return this.id;
    }

    public void setName(String nameOUt) {

        this.name = nameOUt;
    }

    public String getName() {

        return this.name;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}

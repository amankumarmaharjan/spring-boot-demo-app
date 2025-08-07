package com.example.spring_boot_demo_app.model;

public class Employee {
    //fields attributes
    private int id;

    private String name;

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


}

package com.example.spring_boot_demo_app.model;

public class Employee{
    //fields attributes
    private int id;
    private String name;

    //method
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }


}

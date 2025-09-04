package com.example.spring_boot_demo_app.abstractclass;

import com.example.spring_boot_demo_app.inheritiance.*;

public class AbstractClassExample2 {
    public static void main(String[] args) {
//        A a=new A();
        A a;

        a =new B();
        a.display();

        a=new C();
        a.display();
    }

}


abstract class A{
    public abstract void display();
}

//no object creation

class B extends A{
    public void display(){
        System.out.println("This is B");
    }
}
class  C extends A{
    public void display(){
        System.out.println("This is C");
    }
}
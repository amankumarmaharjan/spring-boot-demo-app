package com.example.spring_boot_demo_app.inheritiance;
//A{a=1}
//B{a=1, b=2}
//C{c=3, b=2, a=1}



//method overird
public class InheritanceExample {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.toString());

        a = new B();
        System.out.println(a.toString());

        a = new C();
        System.out.println(a.toString());
    }
}

class A extends Object {

    int a = 1;

    A() {
        System.out.println("Constuctor Called");
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }
}
//extend- inheritance

//same function but different implementation==overriding  //Runtime Polymorphism
//same function but different parameter=overloading   //Compile time poloymorhism
class B extends A {
    int b = 2;

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class C extends B {
    int c = 3;

    @Override
    public String toString() {
        return "C{" +
                "c=" + c +
                ", b=" + b +
                ", a=" + a +
                '}';
    }
}
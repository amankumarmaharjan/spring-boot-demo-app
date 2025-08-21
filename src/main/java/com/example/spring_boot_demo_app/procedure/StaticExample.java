
package com.example.spring_boot_demo_app.procedure;

public class StaticExample {
    public static void printFunction() {
        System.out.println("Static Function Exceuted");
    }

    public static void main(String[] args) {
        System.out.println("StaticExample");
        printFunction();
    }

    static {
        System.out.println("Static Block Exceuted");
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.spring_boot_demo_app.procedure;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 9;
        printSum(num1, num2, num3);
    }

    private static void printSum(int number1, int number2, int number3) {
        int sum = addNumber(number1, number2, number3);
        System.out.println("sum=" + sum);
    }

    private static int addNumber(int a, int b, int c) {
        return a + b;
    }
}

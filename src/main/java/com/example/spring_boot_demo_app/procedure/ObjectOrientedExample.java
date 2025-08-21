package com.example.spring_boot_demo_app.procedure;

class NumberClass {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int sum;

    public NumberClass(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return this.num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public void printSum() {
        this.sum = this.addNumber();
        System.out.println("sum=" + this.sum);
    }

    public int addNumber() {
        return this.num1 + this.num2 + this.num3 + this.num4;
    }

    public static void printFromStatic() {
        System.out.println("Static function");
    }
}

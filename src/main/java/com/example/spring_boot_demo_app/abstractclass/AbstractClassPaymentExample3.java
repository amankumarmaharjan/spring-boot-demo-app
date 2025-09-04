package com.example.spring_boot_demo_app.abstractclass;

public class AbstractClassPaymentExample3 {
    public static void main(String[] args) {
        Payment payment;
        payment = new CreditCardPayment();
        payment.makePayment();

        payment= new CashPayment();
        payment.makePayment();

    }
}

abstract class Payment {
    public abstract void makePayment();
}

class CreditCardPayment extends Payment {
    public void makePayment() {
        System.out.println("Credit Card Payment");
    }
}

class CashPayment extends Payment {
    public void makePayment() {
        System.out.println("Cash Payment");
    }
}
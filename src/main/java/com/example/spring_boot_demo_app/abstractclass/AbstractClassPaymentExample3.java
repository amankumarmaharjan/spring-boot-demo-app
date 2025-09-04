package com.example.spring_boot_demo_app.abstractclass;

public class AbstractClassPaymentExample3 {
    public static void main(String[] args) {
        Payment payment;
        payment = new CreditCardPayment();
        payment.makePayment();
        payment.displayPayment();

        payment= new CashPayment();
        payment.makePayment();
        payment.displayPayment();

    }
}
/* abstract class= minimum 1 abstract method+ other method, no object */
/* interface= all abstract method */


interface Payment {
    void makePayment();
    void displayPayment();
}

class CreditCardPayment implements Payment {
    public void makePayment() {
        System.out.println("Credit Card Payment");
    }

    @Override
    public void displayPayment() {
        System.out.println("Display Credit Card Payment");
    }
}

class CashPayment implements Payment {
    public void makePayment() {
        System.out.println("Cash Payment");
    }

    @Override
    public void displayPayment() {
        System.out.println("Display Cash Payment");
    }
}
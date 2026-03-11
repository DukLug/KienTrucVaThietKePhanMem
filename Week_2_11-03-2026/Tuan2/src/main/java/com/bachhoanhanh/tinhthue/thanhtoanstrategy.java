package com.bachhoanhanh.tinhthue;

public class thanhtoanstrategy {
}

interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Credit Card: " + amount);
    }
}


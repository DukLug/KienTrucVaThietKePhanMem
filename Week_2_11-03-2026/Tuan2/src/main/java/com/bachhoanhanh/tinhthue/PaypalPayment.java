package com.bachhoanhanh.tinhthue;

public class PaypalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng PayPal: " + amount);
    }
}

package com.bachhoanhanh.tinhthue;

public class phigiamgia {
}

interface Payment {
    double pay(double amount);
}

class BasicPayment implements Payment {
    public double pay(double amount) {
        return amount;
    }
}

abstract class PaymentDecorator implements Payment {
    protected Payment payment;

    public PaymentDecorator(Payment payment) {
        this.payment = payment;
    }

    public double pay(double amount) {
        return payment.pay(amount);
    }
}

class ProcessingFee extends PaymentDecorator {
    public ProcessingFee(Payment payment) {
        super(payment);
    }

    public double pay(double amount) {
        return super.pay(amount + 5);
    }
}

class Discount extends PaymentDecorator {
    public Discount(Payment payment) {
        super(payment);
    }

    public double pay(double amount) {
        return super.pay(amount - 10);
    }
}
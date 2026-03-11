package com.bachhoanhanh.strategy;

class NormalShipping implements ShippingStrategy {
    public void ship() {
        System.out.println("Vận chuyển thường");
    }
}

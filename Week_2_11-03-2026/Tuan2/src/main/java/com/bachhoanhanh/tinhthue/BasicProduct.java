package com.bachhoanhanh.tinhthue;

public class BasicProduct implements Product {
    private double price;

    public BasicProduct(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

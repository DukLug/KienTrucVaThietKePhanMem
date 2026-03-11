package com.bachhoanhanh.tinhthue;

public class congnhieuthue {
}

abstract class TaxDecorator implements Product {
    protected Product product;

    public TaxDecorator(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return product.getPrice();
    }
}


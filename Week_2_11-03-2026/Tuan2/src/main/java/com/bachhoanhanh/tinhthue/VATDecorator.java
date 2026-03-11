package com.bachhoanhanh.tinhthue;

public class VATDecorator extends TaxDecorator {
    public VATDecorator(Product product) {
        super(product);
    }

    public double getPrice() {
        return super.getPrice() * 1.1;
    }
}

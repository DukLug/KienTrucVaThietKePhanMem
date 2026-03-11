package com.bachhoanhanh.tinhthue;

public class LuxuryTaxDecorator extends TaxDecorator {
    public LuxuryTaxDecorator(Product product) {
        super(product);
    }

    public double getPrice() {
        return super.getPrice() * 1.2;
    }
}

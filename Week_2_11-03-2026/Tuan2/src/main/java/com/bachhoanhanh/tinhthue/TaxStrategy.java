package com.bachhoanhanh.tinhthue;

interface TaxStrategy {
    double calculate(double price);
}

class VATTax implements TaxStrategy {
    public double calculate(double price) {
        return price * 0.1;
    }
}

class ConsumptionTax implements TaxStrategy {
    public double calculate(double price) {
        return price * 0.05;
    }
}

class TaxCalculator {
    private TaxStrategy strategy;

    public void setStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateTax(double price) {
        return strategy.calculate(price);
    }
}
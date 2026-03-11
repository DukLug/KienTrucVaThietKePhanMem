package com.bachhoanhanh.strategy;

public class ShippingService {
    private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void shipOrder() {
        strategy.ship();
    }
}
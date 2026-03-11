package com.bachhoanhanh.decorator;

public class InsuranceDecorator extends OrderDecorator {
    public InsuranceDecorator(OrderComponent order) {
        super(order);
    }

    public void process() {
        super.process();
        System.out.println("Thêm bảo hiểm vận chuyển");
    }
}
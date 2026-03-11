package com.bachhoanhanh.decorator;

abstract class OrderDecorator implements OrderComponent {
    protected OrderComponent order;

    public OrderDecorator(OrderComponent order) {
        this.order = order;
    }

    public void process() {
        order.process();
    }
}

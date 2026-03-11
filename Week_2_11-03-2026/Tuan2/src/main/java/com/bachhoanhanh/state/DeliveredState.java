package com.bachhoanhanh.state;

class DeliveredState implements OrderState {
    public void handle() {
        System.out.println("Đơn hàng đã giao");
    }
}

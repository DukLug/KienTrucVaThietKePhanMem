package com.bachhoanhanh.state;

class CanceledState implements OrderState {
    public void handle() {
        System.out.println("Hủy đơn và hoàn tiền");
    }
}
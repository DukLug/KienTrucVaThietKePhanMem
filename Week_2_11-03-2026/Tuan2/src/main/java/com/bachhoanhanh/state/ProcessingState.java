package com.bachhoanhanh.state;

class ProcessingState implements OrderState {
    public void handle() {
        System.out.println("Đóng gói và vận chuyển");
    }
}

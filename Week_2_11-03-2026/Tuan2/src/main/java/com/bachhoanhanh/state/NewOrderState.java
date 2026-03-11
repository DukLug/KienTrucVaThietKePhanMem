package com.bachhoanhanh.state;

public class NewOrderState implements OrderState {
    public void handle() {
        System.out.println("Kiểm tra thông tin đơn hàng");
    }
}
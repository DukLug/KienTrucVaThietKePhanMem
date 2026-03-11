package com.bachhoanhanh;
import com.bachhoanhanh.bai1.factory.Notification;
import com.bachhoanhanh.bai1.factory.NotificationFactory;
import com.bachhoanhanh.bai1.singleton.Configuration;
import com.bachhoanhanh.decorator.BasicOrder;
import com.bachhoanhanh.decorator.InsuranceDecorator;
import com.bachhoanhanh.decorator.OrderComponent;
import com.bachhoanhanh.state.NewOrderState;
import com.bachhoanhanh.state.Order;
import com.bachhoanhanh.strategy.FastShipping;
import com.bachhoanhanh.strategy.ShippingService;
import com.bachhoanhanh.tinhthue.*;

public class Main {
    public static void main(String[] args) {
        // bai 1
        Configuration instance = Configuration.getInstance();
        System.out.println(instance.getDbUrl());

        NotificationFactory.createNotification("SMS").send();
        NotificationFactory.createNotification("EMAIL").send();


        // bai 2


        // State
        Order order = new Order();
        order.setState(new NewOrderState());
        order.process();

        // Strategy
        ShippingService ship = new ShippingService();
        ship.setStrategy(new FastShipping());
        ship.shipOrder();

        // Decorator
        OrderComponent orderComponent =
                new InsuranceDecorator(new BasicOrder());
        orderComponent.process();

        // Tax
        Product product =
                new LuxuryTaxDecorator(new VATDecorator(new BasicProduct(100)));
        System.out.println("Giá sau thuế: " + product.getPrice());

        // Payment
        PaymentContext payment = new PaymentContext();
        payment.setStrategy(new PaypalPayment());
        payment.pay(200);
    }
}
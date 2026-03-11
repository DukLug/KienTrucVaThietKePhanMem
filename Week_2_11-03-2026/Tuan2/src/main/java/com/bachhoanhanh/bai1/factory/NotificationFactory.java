package com.bachhoanhanh.bai1.factory;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type.equals("EMAIL")) return new EmailNotification();
        if (type.equals("SMS")) return new SMSNotification();
        return null;
    }
}

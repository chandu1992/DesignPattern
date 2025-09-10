package com.interview.DesignPattern.creationalDesignPattern.Factory;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}

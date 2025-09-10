package com.interview.DesignPattern.creationalDesignPattern.Factory;

public class EmailNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}



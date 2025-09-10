package com.interview.DesignPattern.creationalDesignPattern.Factory;

public class MainFactoryClass {

    public static void main(String[] args) {

        NotificationFactory factory = new EmailNotificationFactory();
        Notification notification = factory.createNotification();
        notification.notifyUser(); // o/p Sending an Email notification

        factory = new SMSNotificationFactory();
        notification = factory.createNotification();
        notification.notifyUser(); // O/p Sending an SMS notification
    }
}

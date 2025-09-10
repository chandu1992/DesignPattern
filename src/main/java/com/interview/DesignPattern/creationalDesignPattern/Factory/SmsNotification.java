package com.interview.DesignPattern.creationalDesignPattern.Factory;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}

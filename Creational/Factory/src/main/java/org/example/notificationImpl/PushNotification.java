package org.example.notificationImpl;

import org.example.productInterface.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification : "+message);
    }
}

package org.example.notificationImpl;

import org.example.productInterface.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email : "+message);
    }
}

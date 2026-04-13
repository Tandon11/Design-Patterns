package org.example.notificationImpl;

import org.example.productInterface.Notification;

public class SlackNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("You have a new slack message : "+message);
    }
}

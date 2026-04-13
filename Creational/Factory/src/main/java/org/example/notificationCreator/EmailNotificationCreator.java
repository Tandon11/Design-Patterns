package org.example.notificationCreator;

import org.example.productInterface.Notification;
import org.example.notificationImpl.EmailNotification;

public class EmailNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

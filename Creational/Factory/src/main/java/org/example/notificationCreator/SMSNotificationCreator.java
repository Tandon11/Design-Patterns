package org.example.notificationCreator;

import org.example.productInterface.Notification;
import org.example.notificationImpl.SMSNotification;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}

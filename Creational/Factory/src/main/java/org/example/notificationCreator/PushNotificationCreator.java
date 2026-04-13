package org.example.notificationCreator;

import org.example.productInterface.Notification;
import org.example.notificationImpl.PushNotification;

public class PushNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}

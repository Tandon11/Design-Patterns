package org.example.notificationCreator;

import org.example.productInterface.Notification;
import org.example.notificationImpl.SlackNotification;

public class SlackNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SlackNotification();
    }
}

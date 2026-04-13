package org.example;

import org.example.notificationCreator.*;

public class FactoryMethodDemo {
    static void main() {
        NotificationCreator notificationCreator;

        // Send Email
        notificationCreator = new EmailNotificationCreator();
        notificationCreator.send("Welcome to Notion Docs...");

        // Send SMS
        notificationCreator = new SMSNotificationCreator();
        notificationCreator.send("OTP for the transaction is 123456");

        // Push Notification
        notificationCreator = new PushNotificationCreator();
        notificationCreator.send("You have a new follower");

        /*
        *  If tomorrow we want to add SlackNotification It's easier for to add while following Open/Close Principle
        */

        notificationCreator = new SlackNotificationCreator();
        notificationCreator.send("Hello Abhishek");
    }
}

package org.example.notificationSystem.factory;

import org.example.notificationSystem.model.EmailNotification;
import org.example.notificationSystem.model.Notification;
import org.example.notificationSystem.model.PushNotification;
import org.example.notificationSystem.model.SMSNotification;

public class NotificationFactory {

    public static Notification createNotification(String type, String recepient, String msg){
        return switch (type.toLowerCase()) {
            case "email" -> EmailNotification.builder().receipent(recepient).msg(msg).build();
            case "sms" -> SMSNotification.builder().receipent(recepient).msg(msg).build();
            case "push" -> PushNotification.builder().receipent(recepient).msg(msg).build();
            default -> throw new IllegalArgumentException("Invalid notification types: " + type);
        };
    }
}

package org.example.notificationSystem.service;

import org.example.notificationSystem.model.Notification;

public class NotificationValidator {

    public static boolean isValid(Notification notification){
        return notification.validate();
    }
}

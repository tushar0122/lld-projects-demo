package org.example.notificationSystem.service;

import org.example.notificationSystem.model.Notification;

public class NotificationSender {

    public void sendNotification(Notification notification){
        if(NotificationValidator.isValid(notification)){
            notification.send();
        }
        else{
            System.out.println("Invalid Notification. Cannot Send");
        }
    }
}

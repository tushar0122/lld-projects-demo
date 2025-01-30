package org.example.notificationSystem;

import org.example.notificationSystem.factory.NotificationFactory;
import org.example.notificationSystem.model.Notification;
import org.example.notificationSystem.service.NotificationSender;

public class Main {

    public static void main(String[] args){
        NotificationSender sender = new NotificationSender();
        Notification email = NotificationFactory.createNotification("email", "agrawal.coder@gmail.com", "Hii");
        Notification sms = NotificationFactory.createNotification("sms", "9685322737", "Hii");
        Notification push = NotificationFactory.createNotification("push", "agrawal.coder@gmail.com", "Hii");

        sender.sendNotification(email);
        sender.sendNotification(sms);
        sender.sendNotification(push);
    }
}

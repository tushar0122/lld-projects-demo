package org.example.notificationSystem.model;


import lombok.experimental.SuperBuilder;

@SuperBuilder
public class PushNotification extends Notification{

    @Override
    public boolean validate() {
        return !receipent.isEmpty() && !msg.isEmpty();
    }

    @Override
    public void send() {
        System.out.println("Sending Push Notification to "+receipent+" : "+msg);
    }
}

package org.example.notificationSystem.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class EmailNotification extends Notification{

    @Override
    public boolean validate() {
        return receipent.contains("@") && !msg.isEmpty();
    }

    @Override
    public void send() {
        System.out.println("Sending Mail to "+receipent+" : "+msg);
    }
}

package org.example.notificationSystem.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class SMSNotification extends Notification{

    // Using Super Builder to avoid constructor

    @Override
    public boolean validate() {
        return receipent.matches("^\\d{10}$");
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to "+receipent+" : "+msg);
    }
}

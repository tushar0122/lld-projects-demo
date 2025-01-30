package org.example.notificationSystem.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
public abstract class Notification {
    protected String receipent;
    protected String msg;
    public abstract boolean validate();
    public abstract void send();
}

package org.example.structural.decorator.realization;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SMSNotification implements Notification {
    Notification notification;

    @Override
    public void sendMessage() {
        System.out.println("sms notification");
        sendMessageInnerNotification(notification);
    }
}

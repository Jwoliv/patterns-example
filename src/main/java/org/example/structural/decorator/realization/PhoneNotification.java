package org.example.structural.decorator.realization;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PhoneNotification implements Notification {
    private Notification notification;

    @Override
    public void sendMessage() {
        System.out.println("phone notification");
        sendMessageInnerNotification(notification);
    }
}

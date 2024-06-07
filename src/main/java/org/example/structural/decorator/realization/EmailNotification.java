package org.example.structural.decorator.realization;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class EmailNotification implements Notification {
    private Notification notification;

    @Override
    public void sendMessage() {
        System.out.println("send message to email address");
        sendMessageInnerNotification(notification);
    }
}

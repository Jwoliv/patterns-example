package org.example.structural.decorator;

import org.example.structural.decorator.realization.EmailNotification;
import org.example.structural.decorator.realization.Notification;
import org.example.structural.decorator.realization.PhoneNotification;
import org.example.structural.decorator.realization.SMSNotification;

public class Main {
    public static void main(String[] args) {
        sendNotificationToChannel(new EmailNotification(new SMSNotification(new PhoneNotification())));
    }

    public static void sendNotificationToChannel(Notification notification) {
        notification.sendMessage();
    }
}

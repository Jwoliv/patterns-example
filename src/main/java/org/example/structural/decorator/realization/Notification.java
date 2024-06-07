package org.example.structural.decorator.realization;

import java.util.Objects;

public interface Notification {
    void sendMessage();

    default void sendMessageInnerNotification(Notification notification) {
        if (Objects.nonNull(notification)) {
            notification.sendMessage();
        }
    }
}

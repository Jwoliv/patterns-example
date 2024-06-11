package org.example.behavioral.observer.realization.listener;

public class PushMsgListener extends Listener {
    public PushMsgListener(String title) {
        super(title);
    }

    @Override
    public void notify(String text) {
        System.out.printf("push message listener [%s] notify { msg: [%s] }\n", title, text);
    }
}

package org.example.behavioral.observer.realization.listener;

public class EmailListener extends Listener {
    public EmailListener(String title) {
        super(title);
    }

    @Override
    public void notify(String text) {
        System.out.printf("email listener [%s] notify { msg: [%s] }\n", title, text);
    }
}

package org.example.behavioral.command.realization.service;

public class EmailService implements EmailServiceI {
    @Override
    public void send() {
        System.out.println("send email");
    }

    @Override
    public void receive() {
        System.out.println("receive email");
    }

    @Override
    public void delete() {
        System.out.println("delete email");
    }
}

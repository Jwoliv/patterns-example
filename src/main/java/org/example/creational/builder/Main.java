package org.example.creational.builder;

import org.example.creational.builder.modal.User;
import org.example.creational.builder.service.UserServiceI;
import org.example.creational.builder.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceI userService = new UserServiceImpl();
        User user = userService.getUser();
        System.out.println(user);
    }
}

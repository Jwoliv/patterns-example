package org.example.creational.builder.service.impl;

import org.example.creational.builder.modal.Skill;
import org.example.creational.builder.modal.User;
import org.example.creational.builder.service.UserServiceI;

import java.util.List;

public class UserServiceImpl implements UserServiceI {

    @Override
    public User getUser() {
        return User.builder()
                .id(1L)
                .firstName("first_name_example")
                .secondName("second_name_example")
                .address("address_example")
                .email("email_example@gmail.com")
                .skills(List.of(Skill.builder().id(1L).title("example title").build()))
                .build();
    }
}

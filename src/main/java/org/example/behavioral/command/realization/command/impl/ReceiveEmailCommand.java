package org.example.behavioral.command.realization.command.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.behavioral.command.realization.command.Command;
import org.example.behavioral.command.realization.service.EmailServiceI;

@NoArgsConstructor
@AllArgsConstructor
public class ReceiveEmailCommand implements Command {
    private EmailServiceI emailService;


    @Override
    public void execute() {
        emailService.receive();
    }
}

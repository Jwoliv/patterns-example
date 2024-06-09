package org.example.behavioral.command;

import org.example.behavioral.command.realization.command.Command;
import org.example.behavioral.command.realization.command.impl.DeleteEmailCommand;
import org.example.behavioral.command.realization.command.impl.ReceiveEmailCommand;
import org.example.behavioral.command.realization.command.impl.SendEmailCommand;
import org.example.behavioral.command.realization.service.EmailService;
import org.example.behavioral.command.realization.service.EmailServiceI;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailServiceI emailService = new EmailService();
        List<Command> commands = List.of(
                new SendEmailCommand(emailService),
                new DeleteEmailCommand(emailService),
                new ReceiveEmailCommand(emailService),
                new SendEmailCommand(emailService),
                new SendEmailCommand(emailService)
        );
        commands.forEach(Main::method);
    }

    public static void method(Command command) {
        command.execute();
    }
}

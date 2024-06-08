package org.example.structural.facade.realization.check.utils;

import org.example.structural.facade.realization.check.modal.Check;

public class CheckSender {
    public String sendCheckToClient(Check check) {
        return """
               id: [%d]
               sum: [%f]
               tip: [%f]
               tax: [%f]
               """.formatted(check.getId(), check.getSum(), check.getTax(), check.getTip());
    }
}

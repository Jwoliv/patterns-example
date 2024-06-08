package org.example.structural.facade.realization.check.utils;

import org.example.structural.facade.realization.check.modal.Check;

public class CheckSender {
    public String sendCheckToClient(Check check) {
        return """
               id: [%d]
               sum: [%.2f]
               tip: [%.2f]
               tax: [%.2f]
               """.formatted(check.getId(), check.getSum(), check.getTax(), check.getTip());
    }
}

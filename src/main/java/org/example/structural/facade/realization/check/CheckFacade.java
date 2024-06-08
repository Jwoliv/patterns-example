package org.example.structural.facade.realization.check;

public class CheckFacade {

    CheckValidator checkValidator = new CheckValidator();
    CheckSender checkSender = new CheckSender();

    public void proceedCheck(Check check) {
        if (checkValidator.isValidCheck(check)) {
            checkSender.sendCheckToClient(check);
        }
    }
}

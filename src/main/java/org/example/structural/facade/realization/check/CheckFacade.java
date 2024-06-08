package org.example.structural.facade.realization.check;

public class CheckFacade {

    CheckValidator checkValidator = new CheckValidator();
    CheckSender checkSender = new CheckSender();

    public String  proceedCheck(Check check) {
        if (checkValidator.isValidCheck(check)) {
            return checkSender.sendCheckToClient(check);
        }
        return "";
    }
}

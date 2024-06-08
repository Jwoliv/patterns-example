package org.example.structural.facade.realization.check;

import org.example.structural.facade.realization.check.modal.Check;
import org.example.structural.facade.realization.check.utils.CheckSender;
import org.example.structural.facade.realization.check.utils.CheckValidator;

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

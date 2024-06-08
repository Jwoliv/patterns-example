package org.example.structural.facade.realization;

import org.example.structural.facade.realization.check.Check;
import org.example.structural.facade.realization.check.CheckFacade;

public class Client implements ClientI {
    CheckFacade checkFacade = new CheckFacade();

    @Override
    public String proceedCheck(Check check) {
        return checkFacade.proceedCheck(check);
    }
}

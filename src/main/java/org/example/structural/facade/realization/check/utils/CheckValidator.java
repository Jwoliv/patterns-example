package org.example.structural.facade.realization.check.utils;

import org.example.structural.facade.realization.check.modal.Check;

public class CheckValidator {
    public Boolean isValidCheck(Check check) {
        return check.getSum() >= 0 && check.getTax() >= 0 && check.getTip() >= 0;
    }
}

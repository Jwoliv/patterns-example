package org.example.structural.facade.realization.check;

public class CheckValidator {
    public Boolean isValidCheck(Check check) {
        return check.getSum() >= 0 && check.getTax() >= 0 && check.getTip() >= 0;
    }
}

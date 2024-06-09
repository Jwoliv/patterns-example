package org.example.behavioral.chain_of_responsibility;

import org.example.behavioral.chain_of_responsibility.realization.impl.CheckHandler;
import org.example.behavioral.chain_of_responsibility.realization.MainHandler;
import org.example.behavioral.chain_of_responsibility.realization.impl.PrintHandler;
import org.example.behavioral.chain_of_responsibility.realization.impl.ValidateHandler;

public class Main {
    public static void main(String[] args) {
        MainHandler mainHandler = new ValidateHandler(new CheckHandler(new PrintHandler(null)));
        mainHandler.handlerExecute("example of the text");
    }
}

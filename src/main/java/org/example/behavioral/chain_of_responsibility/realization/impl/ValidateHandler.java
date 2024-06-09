package org.example.behavioral.chain_of_responsibility.realization.impl;

import org.example.behavioral.chain_of_responsibility.realization.MainHandler;

public class ValidateHandler extends MainHandler {
    public ValidateHandler(MainHandler mainHandler) {
        this.mainHandler = mainHandler;
    }

    @Override
    public void handlerExecute(String text) {
       mainHandler.handlerExecute(text + "!");
    }
}

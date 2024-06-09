package org.example.behavioral.chain_of_responsibility.realization.impl;

import org.example.behavioral.chain_of_responsibility.realization.MainHandler;

import java.util.Objects;

public class CheckHandler extends MainHandler {

    public CheckHandler(MainHandler mainHandler) {
        this.mainHandler = mainHandler;
    }

    @Override
    public void handlerExecute(String text) {
        if (text.length() > 10 && Objects.nonNull(mainHandler)) {
            mainHandler.handlerExecute(text);
        }
    }
}

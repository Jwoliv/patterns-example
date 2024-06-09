package org.example.behavioral.chain_of_responsibility.realization.impl;

import org.example.behavioral.chain_of_responsibility.realization.MainHandler;

import java.util.Objects;

public class PrintHandler extends MainHandler {

    public PrintHandler(MainHandler mainHandler) {
        this.mainHandler = mainHandler;
    }

    @Override
    public void handlerExecute(String text) {
        System.out.println(text);
        if (Objects.nonNull(mainHandler)) {
            mainHandler.handlerExecute(text);
        }
    }
}

package org.example.behavioral.chain_of_responsibility.realization;

import java.util.Objects;

public abstract class MainHandler {
    protected MainHandler mainHandler;

    public void handlerExecute(String text) {
        if (Objects.nonNull(mainHandler)) {
            mainHandler.handlerExecute(text);
        }
    }
}

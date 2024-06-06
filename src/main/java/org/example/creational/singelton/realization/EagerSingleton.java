package org.example.creational.singelton.realization;

import lombok.ToString;

@ToString
public class EagerSingleton {
    private final Long id;
    private final String title;
    private static final EagerSingleton INSTANCE = new EagerSingleton(1L, "title");


    private EagerSingleton(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}

package org.example.creational.singelton.realization;

import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString
public class LazySingleton {
    private final Long id;
    private final String title;
    private static LazySingleton INSTANCE;

    private LazySingleton(Long id, String  title) {
        this.id = id;
        this.title = title;
    }


    public static LazySingleton getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (LazySingleton.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new LazySingleton(1L, "title example");
                }
            }
        }
        return INSTANCE;
    }
}

package org.example.behavioral.observer.realization.listener;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public abstract class Listener {

    protected String title;

    public abstract void notify(String text);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Listener listener = (Listener) o;

        return Objects.equals(title, listener.title);
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}

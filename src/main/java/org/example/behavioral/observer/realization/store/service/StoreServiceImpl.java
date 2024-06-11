package org.example.behavioral.observer.realization.store.service;

import lombok.AllArgsConstructor;
import org.example.behavioral.observer.realization.listener.Listener;
import org.example.behavioral.observer.realization.store.modal.Store;

import java.util.*;

@AllArgsConstructor
public class StoreServiceImpl implements StoreService {

    private List<Listener> listeners;

    @Override
    public void addNewItem(String text, Store store) {
        if (Objects.isNull(store.getItems())) {
            store.setItems(new ArrayList<>());
        }
        store.getItems().add(text);
        notifyAllAboutNewItem(text);
    }

    @Override
    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    public void notifyAllAboutNewItem(String text) {
        Optional.of(listeners)
                .orElse(Collections.emptyList())
                .forEach(listener -> listener.notify(text));
    }
}

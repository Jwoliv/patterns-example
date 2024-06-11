package org.example.behavioral.observer.realization.store.service;

import org.example.behavioral.observer.realization.listener.Listener;
import org.example.behavioral.observer.realization.store.modal.Store;

public interface StoreService {
    void addNewItem(String text, Store store);
    void addListener(Listener listener);
    void removeListener(Listener listener);
}

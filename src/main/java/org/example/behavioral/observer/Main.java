package org.example.behavioral.observer;

import org.example.behavioral.observer.realization.listener.EmailListener;
import org.example.behavioral.observer.realization.listener.PushMsgListener;
import org.example.behavioral.observer.realization.store.modal.Store;
import org.example.behavioral.observer.realization.store.service.StoreService;
import org.example.behavioral.observer.realization.store.service.StoreServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl(new ArrayList<>());
        Store store = new Store(new ArrayList<>());

        storeService.addListener(new PushMsgListener("push-msg#1"));
        storeService.addListener(new PushMsgListener("push-msg#2"));
        storeService.addListener(new EmailListener("email-msg#1"));
        storeService.addListener(new EmailListener("email-msg#2"));

        storeService.addNewItem("example 1", store);
        storeService.addNewItem("example second", store);

        storeService.removeListener(new EmailListener("email-msg#1"));
        System.out.println("###########################################");

        storeService.addNewItem("example #3", store);
    }
}

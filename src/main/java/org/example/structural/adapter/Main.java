package org.example.structural.adapter;

import org.example.structural.adapter.realization.current.NewService;
import org.example.structural.adapter.realization.current.NewServiceI;

public class Main {
    public static void main(String[] args) {
        NewServiceI newService = new NewService();
        newService.getBaseInfo();
        newService.getExtraInfo();
    }
}

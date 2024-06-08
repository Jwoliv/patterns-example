package org.example.structural.proxy.realization;

public class ObjectItem implements ItemI {
    @Override
    public void invoke() {
        System.out.println("object functional");
    }
}

package org.example.structural.proxy;

import org.example.structural.proxy.realization.ItemI;
import org.example.structural.proxy.realization.ObjectItem;
import org.example.structural.proxy.realization.ProxyItem;

public class Main {
    public static void main(String[] args) {
        call(new ProxyItem());
        call(new ObjectItem());
    }

    public static void call(ItemI item) {
        item.invoke();
        System.out.println(String.join("", java.util.Collections.nCopies(50, "#")));
    }
}

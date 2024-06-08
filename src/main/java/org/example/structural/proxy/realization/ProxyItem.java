package org.example.structural.proxy.realization;

public class ProxyItem implements ItemI {
    private ObjectItem objectItem = new ObjectItem();

    @Override
    public void invoke() {
        System.out.println("proxy functional");
        objectItem.invoke();
    }
}

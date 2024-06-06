package org.example.creational.abstract_factory.realization.instance;

public class AzureInstance implements Instance {
    @Override
    public void start() {
        System.out.println("start azure instance");
    }

    @Override
    public void stop() {
        System.out.println("stop azure instance");
    }

    @Override
    public void reset() {
        System.out.println("reset azure instance");
    }
}

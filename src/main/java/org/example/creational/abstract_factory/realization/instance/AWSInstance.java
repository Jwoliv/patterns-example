package org.example.creational.abstract_factory.realization.instance;

public class AWSInstance implements Instance {
    @Override
    public void start() {
        System.out.println("start aws instance");
    }

    @Override
    public void stop() {
        System.out.println("stop aws instance");
    }

    @Override
    public void reset() {
        System.out.println("reset aws instance");
    }
}

package org.example.creational.abstract_factory.realization.storage;

public class AWSStorage implements Storage {
    @Override
    public void getInfo() {
        System.out.println("aws storage");
    }
}

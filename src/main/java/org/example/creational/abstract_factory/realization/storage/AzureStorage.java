package org.example.creational.abstract_factory.realization.storage;

public class AzureStorage implements Storage {
    @Override
    public void getInfo() {
        System.out.println("azure storage");
    }
}

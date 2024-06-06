package org.example.creational.abstract_factory.realization.network;

public class AzureNetwork implements Network {
    @Override
    public void healthCheck() {
        System.out.println("azure network");
    }
}

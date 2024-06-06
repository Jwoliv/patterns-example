package org.example.creational.abstract_factory.realization.network;

public class AWSNetwork implements Network {
    @Override
    public void healthCheck() {
        System.out.println("aws network");
    }
}

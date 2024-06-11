package org.example.behavioral.strategy.realization.job;

public class Management implements JobI {
    @Override
    public void executeJob() {
        System.out.println("management job");
    }
}

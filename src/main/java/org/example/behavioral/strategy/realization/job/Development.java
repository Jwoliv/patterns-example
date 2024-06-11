package org.example.behavioral.strategy.realization.job;

public class Development implements JobI {
    @Override
    public void executeJob() {
        System.out.println("development job");
    }
}

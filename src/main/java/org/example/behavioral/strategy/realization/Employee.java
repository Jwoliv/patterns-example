package org.example.behavioral.strategy.realization;

import org.example.behavioral.strategy.realization.job.JobI;

public class Employee {
    public void executeJob(JobI job) {
        job.executeJob();
    }
}

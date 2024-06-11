package org.example.behavioral.strategy;

import org.example.behavioral.strategy.realization.Employee;
import org.example.behavioral.strategy.realization.job.Development;
import org.example.behavioral.strategy.realization.job.Management;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.executeJob(new Development());
        employee.executeJob(new Management());
    }
}

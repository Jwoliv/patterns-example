package org.example.behavioral.iterator.realization.client;

import org.example.behavioral.iterator.realization.iterator.Iterator;
import org.example.behavioral.iterator.realization.iterator.TypesEmployee;
import org.example.behavioral.iterator.realization.iterator.TypesEmployeeIterator;

public class Client implements ClientI {
    @Override
    public void invoke() {
        Iterator<TypesEmployee> employeeIterator = new TypesEmployeeIterator();
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }
    }
}

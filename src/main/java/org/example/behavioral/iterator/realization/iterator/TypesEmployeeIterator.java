package org.example.behavioral.iterator.realization.iterator;

import java.util.concurrent.atomic.AtomicInteger;

public class TypesEmployeeIterator implements Iterator<TypesEmployee> {

    private final AtomicInteger counter = new AtomicInteger(0);

    @Override
    public boolean hasNext() {
        return counter.get() < TypesEmployee.values().length;
    }

    @Override
    public TypesEmployee next() {
        return TypesEmployee.values()[counter.getAndIncrement()];
    }

}

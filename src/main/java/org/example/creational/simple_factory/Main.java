package org.example.creational.simple_factory;

import org.example.creational.simple_factory.enums.TypeFactory;
import org.example.creational.simple_factory.factory.SimpleFactoryI;
import org.example.creational.simple_factory.factory.SimpleFactoryImpl;

public class Main {

    public static void main(String[] args) {
        SimpleFactoryI simpleFactory = new SimpleFactoryImpl();
        System.out.println(simpleFactory.create(TypeFactory.POST));
        System.out.println(simpleFactory.create(TypeFactory.COMMENT));
    }
}

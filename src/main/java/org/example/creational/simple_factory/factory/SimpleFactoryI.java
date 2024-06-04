package org.example.creational.simple_factory.factory;

import org.example.creational.simple_factory.enums.TypeFactory;
import org.example.creational.simple_factory.modal.BaseEntityI;

public interface SimpleFactoryI {
    BaseEntityI create(TypeFactory typeFactory);
}

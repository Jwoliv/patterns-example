package org.example.creational.factory_method;

import org.example.creational.factory_method.factory.CommentFactory;
import org.example.creational.factory_method.factory.PostFactory;
import org.example.creational.factory_method.factory.FactoryMethod;
import org.example.creational.factory_method.modal.BaseEntityI;

public class Main {
    public static void main(String[] args) {
        System.out.println(getElement(new CommentFactory()));
        System.out.println(getElement(new PostFactory()));
    }

    public static BaseEntityI getElement(FactoryMethod factory) {
        return factory.create();
    }
}

package org.example.creational.singelton;

import org.example.creational.singelton.realization.EagerSingleton;
import org.example.creational.singelton.realization.LazySingleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);
        System.out.println(lazySingleton1.equals(lazySingleton2));

        System.out.println("####################################");

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton1);
        System.out.println(eagerSingleton2);
        System.out.println(eagerSingleton1.equals(eagerSingleton2));

    }
}

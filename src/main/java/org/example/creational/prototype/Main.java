package org.example.creational.prototype;

import org.example.creational.prototype.realization.Attack;
import org.example.creational.prototype.realization.PrototypeI;

public class Main {
    public static void main(String[] args) {
        Attack attack = new Attack(1L, "attack first example");
        System.out.println(attack);

        PrototypeI attackDup = attack.clone();
        System.out.println(attackDup);
    }
}

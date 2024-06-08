package org.example.structural.flyweight;

import org.example.structural.flyweight.realization.TreeConcreteFlyweight;
import org.example.structural.flyweight.realization.TreeExternalContext;

public class Main {
    public static void main(String[] args) {
        //todo: add factory for flyweight object
        TreeExternalContext treeExternalContext = new TreeExternalContext(10L, 540L, 15.5F);
        TreeConcreteFlyweight flyweight = new TreeConcreteFlyweight(12442142L, 42356231L);
        flyweight.printTreeInfo(treeExternalContext);
    }
}

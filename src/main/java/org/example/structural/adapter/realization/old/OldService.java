package org.example.structural.adapter.realization.old;

public class OldService implements OldServiceI {
    @Override
    public void baseInfo() {
        System.out.println("base info");
    }

    @Override
    public void extraInfo() {
        System.out.println("extra info");
    }
}

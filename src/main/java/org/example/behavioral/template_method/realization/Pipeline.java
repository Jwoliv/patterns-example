package org.example.behavioral.template_method.realization;

public interface Pipeline {
    void prepare();
    void build();
    void test();
    void deploy();

    default void launch() {
        prepare();
        build();
        test();
        deploy();
    }
}

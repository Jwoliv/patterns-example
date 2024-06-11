package org.example.behavioral.template_method.realization;

public class JenkinsPipeline implements Pipeline {
    @Override
    public void prepare() {
        System.out.println("jenkins pipeline prepare");
    }

    @Override
    public void build() {
        System.out.println("jenkins pipeline build");
    }

    @Override
    public void test() {
        System.out.println("jenkins pipeline test");
    }

    @Override
    public void deploy() {
        System.out.println("jenkins pipeline deploy");
    }
}

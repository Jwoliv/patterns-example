package org.example.behavioral.template_method.realization;

public class GitLabPipeline implements Pipeline {
    @Override
    public void prepare() {
        System.out.println("git pipeline prepare");
    }

    @Override
    public void build() {
        System.out.println("git pipeline build");
    }

    @Override
    public void test() {
        System.out.println("git pipeline test");
    }

    @Override
    public void deploy() {
        System.out.println("git pipeline deploy");
    }
}

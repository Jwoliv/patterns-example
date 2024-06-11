package org.example.behavioral.template_method;

import org.example.behavioral.template_method.realization.GitLabPipeline;
import org.example.behavioral.template_method.realization.JenkinsPipeline;
import org.example.behavioral.template_method.realization.Pipeline;

public class Main {
    public static void main(String[] args) {
        launchPipeline(new GitLabPipeline());
        System.out.println("#################################");
        launchPipeline(new JenkinsPipeline());
    }

    public static void launchPipeline(Pipeline pipeline) {
        pipeline.launch();
    }
}

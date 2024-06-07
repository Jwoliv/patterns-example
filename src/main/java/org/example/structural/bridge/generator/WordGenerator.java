package org.example.structural.bridge.generator;

public class WordGenerator implements ReportGenerator {
    @Override
    public String generateReport() {
        return "word report";
    }
}

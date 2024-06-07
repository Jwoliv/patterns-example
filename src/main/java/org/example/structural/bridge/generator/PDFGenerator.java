package org.example.structural.bridge.generator;

public class PDFGenerator implements ReportGenerator {
    @Override
    public String generateReport() {
        return "pdf report";
    }
}

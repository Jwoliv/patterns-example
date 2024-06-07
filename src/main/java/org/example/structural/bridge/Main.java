package org.example.structural.bridge;

import org.example.structural.bridge.generator.PDFGenerator;
import org.example.structural.bridge.generator.WordGenerator;
import org.example.structural.bridge.report_sender.ReportSender;
import org.example.structural.bridge.report_sender.ReportSenderI;

public class Main {
    public static void main(String[] args) {
        ReportSenderI pdfSender = new ReportSender(new PDFGenerator());
        ReportSenderI wordSender = new ReportSender(new WordGenerator());
        pdfSender.send();
        wordSender.send();
    }
}

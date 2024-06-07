package org.example.structural.bridge.report_sender;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.structural.bridge.generator.ReportGenerator;

@NoArgsConstructor
@AllArgsConstructor
public class ReportSender implements ReportSenderI {

    ReportGenerator reportGenerator;

    @Override
    public void send() {
        String report = reportGenerator.generateReport();
        System.out.printf("send report: [%s]\n", report);
    }
}

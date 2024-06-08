package org.example.structural.facade.realization.check;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Check {
    public Long id;
    public Float sum;
    public Float tax;
    public Float tip;

    public String sendCheckToClient() {
        return """
               id: [%d]
               sum: [%f]
               tip: [%f]
               tax: [%f]
               """.formatted(id, sum, tax, tip);
    }
}

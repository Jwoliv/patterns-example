package org.example.structural.facade.realization.check;

import lombok.*;

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
}

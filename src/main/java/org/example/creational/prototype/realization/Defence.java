package org.example.creational.prototype.realization;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Defence implements PrototypeI {
    private Long id;
    private String title;


    @Override
    public PrototypeI clone() {
        return new Defence(id, title);
    }
}

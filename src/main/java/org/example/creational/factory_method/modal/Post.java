package org.example.creational.factory_method.modal;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Post implements BaseEntityI {
    private Long id;
    private String title;
}

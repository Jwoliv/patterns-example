package org.example.creational.simple_factory.modal;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Comment implements BaseEntityI {
    private Long id;
    private String title;
    private Long postId;
}

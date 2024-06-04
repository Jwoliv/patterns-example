package org.example.creational.simple_factory.factory;

import org.example.creational.simple_factory.enums.TypeFactory;
import org.example.creational.simple_factory.modal.BaseEntityI;
import org.example.creational.simple_factory.modal.Comment;
import org.example.creational.simple_factory.modal.Post;

public class SimpleFactoryImpl implements SimpleFactoryI {

    @Override
    public BaseEntityI create(TypeFactory typeFactory) {
        return switch (typeFactory) {
            case POST -> Post.builder()
                    .id(1L)
                    .title("example title of post")
                    .build();
            case COMMENT -> Comment.builder()
                    .id(1L)
                    .title("example title of comment")
                    .postId(2L)
                    .build();
        };
    }
}

package org.example.creational.factory_method.factory;

import org.example.creational.factory_method.modal.Comment;

public class CommentFactory implements FactoryMethod {
    @Override
    public Comment create() {
        return Comment.builder()
                .id(1L)
                .title("example title of the comment")
                .postId(2L)
                .build();
    }
}

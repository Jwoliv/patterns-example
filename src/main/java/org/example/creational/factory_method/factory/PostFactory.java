package org.example.creational.factory_method.factory;

import org.example.creational.factory_method.modal.Post;

public class PostFactory implements FactoryMethod {

    @Override
    public Post create() {
        return Post.builder()
                .id(1L)
                .title("example of the title")
                .build();
    }
}

package com.pat.graphql.graphqldemo;

import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepository {

    Author findById(final int authorId) {
        return Author.builder().id(1).name("Martin Fowler").build();
    }
}

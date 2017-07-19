package com.pat.graphql.graphqldemo;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class BookRepository {

    public List<Book> findAll() {
        return Collections.singletonList(Book.builder()
                .id(1)
                .name("Refactoring")
                .build()
        );
    }
}

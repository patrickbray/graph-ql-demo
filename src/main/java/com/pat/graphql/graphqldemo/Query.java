package com.pat.graphql.graphqldemo;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLRootResolver {

    private BookRepository bookRepository;

    public Query(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> books() {
        return bookRepository.findAll();
    }
}

package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            bookstoreService.fetchBooks();
        };
    }
}
/*
 * 
 * How To Map @ManyToOne Relationship To A SQL Query Via The Hibernate @JoinFormula

Description: This application is an example of mapping the JPA @ManyToOne relationship to a SQL query via the Hibernate @JoinFormula annotation. We start with two entities, Author and Book, involved in a unidirectional @ManyToOne relationship. Each book has a price. While we fetch a book by id (let's call it book A), we want to fetch another book B of the same author whose price is the next smaller price in comparison with book A price.

Key points:

fetching the book B is done via @JoinFormula
 */

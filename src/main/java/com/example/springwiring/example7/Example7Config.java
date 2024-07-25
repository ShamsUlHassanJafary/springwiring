package com.example.springwiring.example7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example7Config {

    @Bean(value = "Author1")
    public Author author1(){
        Author author = new Author();
        author.setName("Shams");
        return author;
    }

    @Bean(value = "Author2")
    public Author author2(){
        Author author = new Author();
        author.setName("Sabir");
        return author;
    }

    @Bean
    public Book book(@Qualifier ("Author2") Author author){
        Book book = new Book();
        book.setName("Spring Boot");
        book.setAuthor(author);
        return book;
    }

}

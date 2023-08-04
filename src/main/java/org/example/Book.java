package org.example;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Book {

    private String title;
    private Author author;
    private LocalDate publication;
    private Integer pages;
    private String genre;

    public Book(String title, Author author, LocalDate publication, Integer pages, String genre) {
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.pages = pages;
        this.genre = genre;
    }
}

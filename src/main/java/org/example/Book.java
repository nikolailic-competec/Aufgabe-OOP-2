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
    private int pages;
    private String genre;

    private Book(String title, Author author, LocalDate publication, Integer pages, String genre) {
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.pages = pages;
        this.genre = genre;
    }

    public static Book createBook(String title, Author author, LocalDate publication, Integer pages, String genre) {

        if (title == null || author == null || publication == null || pages < 0 || genre == null) {

            throw new IllegalArgumentException("Invalid input");
        }

        return new Book(title, author, publication, pages, genre);
    }
}

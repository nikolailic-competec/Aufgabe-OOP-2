package org.example;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Book
{

    private String title;
    private Author author;
    private LocalDate publication;
    private int pages;
    private String genre;

    public Book(@NonNull String title, @NonNull Author author, @NonNull LocalDate publication, int pages, @NonNull String genre)
    {
        if (pages < 1) {
            throw new IllegalArgumentException("Number of pages cannot be smaller than 1");
        }
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.pages = pages;
        this.genre = genre;
    }
}

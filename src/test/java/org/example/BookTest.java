package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest
{

    Author author = mock(Author.class);
    Book book;

    @BeforeEach
    void setUp()
    {

        LocalDate localDate = LocalDate.of(2023, 8, 1);
        book = new Book("test", author, localDate, 300, "Fiction");
    }

    @Test
    void invalidPages()
    {

        assertThrows(IllegalArgumentException.class, () ->
            new Book(book.getTitle(), author, book.getPublication(), -1, book.getGenre()));
    }

    @Test
    void get_authorFirstname_from_book()
    {

        when(author.getFirstName()).thenReturn("Big");

        assertEquals("Big", book.getAuthor().getFirstName());
    }
}

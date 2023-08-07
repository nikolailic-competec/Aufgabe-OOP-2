package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class BookTest
{

    Author author = mock(Author.class);
    Book book = mock(Book.class);

    @Test
    void validBook()
    {

        LocalDate localDate = LocalDate.of(2023, 8, 1);

        when(book.getAuthor()).thenReturn(author);
        when(book.getPublication()).thenReturn(localDate);
        when(book.getPages()).thenReturn(300);
        when(book.getTitle()).thenReturn("test");
        when(book.getGenre()).thenReturn("Fiction");

        assertEquals("test", book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(localDate, book.getPublication());
        assertEquals(300, book.getPages());
        assertEquals("Fiction", book.getGenre());
    }

    @Test
    void invalidPages()
    {
        LocalDate localDate = LocalDate.of(2023, 8, 1);

        when(book.getAuthor()).thenReturn(author);
        when(book.getPublication()).thenReturn(localDate);
        when(book.getPages()).thenReturn(-1);
        when(book.getTitle()).thenReturn("test");
        when(book.getGenre()).thenReturn("Fiction");

        assertThrows(IllegalArgumentException.class, () -> {
            new Book(book.getTitle(), author, book.getPublication(), book.getPages(), book.getGenre());
        });
    }

    @Test
    void get_authorFirstname_from_book()
    {

        when(book.getAuthor()).thenReturn(author);
        when(author.getFirstName()).thenReturn("Big");

        assertEquals("Big", book.getAuthor().getFirstName());
    }
}

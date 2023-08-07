package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class BookTest
{

    @Test
    void testValidBook()
    {
        Author author = new Author("John", "Doe", "john.doe@example.com");
        LocalDate publicationDate = LocalDate.of(2023, 8, 1);

        Book book = new Book("Sample Book", author, publicationDate, 300, "Fiction");

        assertEquals("Sample Book", book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(publicationDate, book.getPublication());
        assertEquals(300, book.getPages());
        assertEquals("Fiction", book.getGenre());
    }

    @Test
    void testInvalidPages()
    {
        Author author = new Author("Jane", "Smith", "jane.smith@example.com");
        LocalDate publicationDate = LocalDate.of(2022, 5, 15);

        assertThrows(IllegalArgumentException.class, () -> {
            new Book("Invalid Book", author, publicationDate, 0, "Non-fiction");
        });
    }
}

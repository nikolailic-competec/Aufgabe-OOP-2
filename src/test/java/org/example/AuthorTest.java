package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class AuthorTest
{

    Author author = mock(Author.class);

    @Test
    void testValidAuthor()
    {

        when(author.getFirstName()).thenReturn("Big");
        when(author.getLastName()).thenReturn("Fish");
        when(author.getEmail()).thenReturn("big.fish@gmail.com");

        assertEquals("Big", author.getFirstName());
        assertEquals("Fish", author.getLastName());
        assertEquals("big.fish@gmail.com", author.getEmail());
    }

    @Test
    void testInvalidEmail()
    {
        when(author.getFirstName()).thenReturn("Big");
        when(author.getLastName()).thenReturn("Fish");
        when(author.getEmail()).thenReturn("big.fish_gmail.com");

        assertThrows(IllegalArgumentException.class, () ->
            new Author(author.getFirstName(), author.getLastName(), author.getEmail())
        );
    }
}

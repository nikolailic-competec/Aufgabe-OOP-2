package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthorTest
{

    Author author;

    @BeforeEach
    void setUp()
    {

        author = new Author("Big", "Fish", "big.fish@gmail.com");
    }

    @Test
    void testInvalidEmail()
    {

        assertThrows(IllegalArgumentException.class, () ->
            new Author(author.getFirstName(), author.getLastName(), "test_gmail.com")
        );
    }
}

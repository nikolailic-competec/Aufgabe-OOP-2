package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AuthorTest
{

    @Test
    void testValidEmail()
    {
        assertTrue(Author.validateEmail("test@example.com"));
    }

    @Test
    void testInvalidEmail()
    {
        assertFalse(Author.validateEmail("invalid_email"));
    }
}

package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {

    @Test
    void email() {

        Author author = new Author("Big", "Fisch");

        assertEquals("Big.Fisch@gmail.com", author.email());
    }
}
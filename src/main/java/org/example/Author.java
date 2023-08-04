package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {

    private String firstName;
    private String lastName;

    private Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String email() {
        return firstName + "." + lastName + "@gmail.com";
    }

    public static Author createAuthor(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("firstName and lastName cannot be null");
        }

        return new Author(firstName, lastName);
    }
}

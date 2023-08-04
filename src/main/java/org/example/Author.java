package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String email() {
        return firstName + "." + lastName + "@gmail.com";
    }
}

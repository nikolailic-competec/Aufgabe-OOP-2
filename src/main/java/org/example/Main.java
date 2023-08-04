package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Author RiMa = Author.createAuthor("Rifujin", "Magonote");
        Book MoTe =  Book.createBook(
                "Mushoku Tensei",
                RiMa,
                LocalDate.parse("2023-08-25"),
                300,
                "Isekai");

        System.out.println(MoTe.getAuthor().getFirstName());
        System.out.println(RiMa.email());
        System.out.println(MoTe.getTitle());
    }
}

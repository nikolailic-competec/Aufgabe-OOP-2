package org.example;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {

        Author RiMa = new Author("Rifujin", "Magonote", "rifujin.magonote@gmail.com");
        Book MoTe = new Book(
            "Mushoku Tensei",
            RiMa,
            LocalDate.parse("2023-08-25"),
            1,
            "Isekai"
        );

        System.out.println(MoTe.getAuthor().getFirstName());
        System.out.println(RiMa.getEmail());
        System.out.println(MoTe.getTitle());
    }
}

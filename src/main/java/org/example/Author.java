package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Author
{

    private static final String EMAIL_PATTERN =
        "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    private String firstName;
    private String lastName;
    private String email;

    public Author(@NonNull String firstName, @NonNull String lastName, @NonNull String email)
    {
        if (!validateEmail(email)) {
            throw new IllegalArgumentException("Invalid email");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static boolean validateEmail(String email)
    {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

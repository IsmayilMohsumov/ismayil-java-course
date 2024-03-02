package org.example.lesson8.ismayil;

public class AuthCheck {

    public static Boolean checkIfLoginIsValid(String login) {
        return login.endsWith("@gmail.com");
    }
}

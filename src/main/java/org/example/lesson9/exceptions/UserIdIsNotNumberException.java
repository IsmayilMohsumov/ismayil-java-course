package org.example.lesson9.exceptions;

public class UserIdIsNotNumberException extends Exception {
    //TODO: juma
    public UserIdIsNotNumberException() {

        super("Isn't correct integer");
    }
    public UserIdIsNotNumberException(String message) {
        super(message);
    }
}
package org.example.lesson9.exceptions;

public class UserIsLessThanTwoException extends Exception{
    public UserIsLessThanTwoException() {
        super("User name has less than 2 characters");
    }

    public UserIsLessThanTwoException(String message) {
        super(message);
    }
}

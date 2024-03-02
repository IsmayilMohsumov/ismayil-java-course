package org.example.lesson9.exceptions;

public class ExampleCustomException extends Exception {

    public ExampleCustomException() {
        super("Exception message goes here");
    }

    public ExampleCustomException(String message) {
        super(message);
    }
}
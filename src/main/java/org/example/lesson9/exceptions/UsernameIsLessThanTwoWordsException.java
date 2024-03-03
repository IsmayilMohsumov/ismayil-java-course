package org.example.lesson9.exceptions;

public class UsernameIsLessThanTwoWordsException extends Exception {

    public UsernameIsLessThanTwoWordsException() {
        super("Exception message goes here");
    }

    public UsernameIsLessThanTwoWordsException(String message) {


        super(message);
    }


}

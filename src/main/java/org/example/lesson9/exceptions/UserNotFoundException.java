package org.example.lesson9.exceptions;

public class UserNotFoundException extends Exception{

    public UserNotFoundException(){
        super("Exception message goes here");

    }
    public UserNotFoundException(String message){

        super(message);
    }

}
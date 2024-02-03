package org.example.lesson3.mahammad;

public class RegisterChecker {

    private String USERNAME = "mahammad";
    private String PASSWORD = "123123M";

    void enterPassword( String login,  String password) {



        if((USERNAME.equals(login) ) && (PASSWORD.equals(password))) {
            System.out.println("Welcome");
        }

        // else-if elave et!
        else{
            System.err.println("Incorrect username or password. Access denied.");
        }
    }

}

package org.example.lesson9.kamil;


import java.io.IOException;

import static org.example.lesson9.ismayil.ReadFileExample.readFile;

public class Main {

    public static void main(String[] args) {

        // Go to lesson9 -> exceptions package -> edit UsernameIsLessThanTwoWordsException (take a look at ExampleCustomException)

        // REPLACE IT WITH YOUR PATH:
        String filePath = "C:\\YOUR-PATH-HERE\\repo-fixed\\ismayil-java-course\\src\\main\\java\\org\\example\\lesson9\\dataset\\users.txt";

        // Get it from SCANNER:
        String targetUserId = "7A";

        try {
            //go to below method
            readFile(filePath, targetUserId);
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
            e.printStackTrace();
        } //TODO: add catch block for UsernameIsLessThanTwoWordsException
    }


}

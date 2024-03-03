package org.example.lesson9.juma;

import org.example.lesson9.exceptions.UserIdIsNotNumberException;
import org.example.lesson9.exceptions.UserNotFoundException;
import org.example.lesson9.exceptions.UsernameIsLessThanTwoWordsException;
import org.example.lesson9.ismayil.ReadFileExample;

import java.io.IOException;
import java.util.Scanner;

import static org.example.lesson9.ismayil.ReadFileExample.readFile;

public class Main {

    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        UserIdIsNotNumberException uiinne = new UserIdIsNotNumberException();


        // Go to lesson9 -> exceptions package -> edit UserIdIsNotNumberException (take a look at ExampleCustomException)

        // REPLACE IT WITH YOUR PATH:
        String filePath = "C:\\Users\\cumay\\Desktop\\Yeni Ismail\\ismayil-java-course\\src\\main\\java\\org\\example\\lesson9\\dataset\\users.txt";

            try {
                //go to below method


                readFile(filePath,10);

            } catch (IOException e) {
                System.err.println("Error reading from the file: " + e.getMessage());
                e.printStackTrace();
            } //TODO: add catch block for UserIdIsNotNumberException
            catch (UserIdIsNotNumberException e) {
                throw new RuntimeException(e);
            } catch (UsernameIsLessThanTwoWordsException | UserNotFoundException e) {
                throw new RuntimeException(e);
            }
    }

    }




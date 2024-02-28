package org.example.lesson8.ismayil;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter =0;
        try {

            System.out.println(5/0);

        }catch(ArithmeticException t){
            System.out.println("ArithmeticException thrown");
            throw new ArithmeticException();
        }catch (Throwable e){
            System.out.println("Exception thrown");
        } finally {
            counter++;
        }

        System.out.println(counter);


    }



}

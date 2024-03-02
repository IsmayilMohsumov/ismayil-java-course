package org.example.lesson8.ismayil;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class RealExample {
    public static void main(String[] args) {
        ifNotThrowMismatch(3);
    }

    public static void ifNotThrowMismatch(int input) throws ArithmeticException {

        if (input == 50){
            System.out.println("everything is ok!");
        }else {
            throw new RuntimeException();
        }

    }
}

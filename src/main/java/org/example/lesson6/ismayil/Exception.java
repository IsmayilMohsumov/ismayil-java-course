package org.example.lesson6.ismayil;

import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select:" +
                "\n 1.Call method" +
                "\n 2. Create Constructor" +
                "\n 3. Exit");

        int userInput = sc.nextInt(); //

        switch (userInput){
            case 1:
                callMethod();
                break;
            case 2:

                break;
            case 3:
                break;
        }



    }

    static void callMethod(){
        System.out.println("Method called");
    }
}

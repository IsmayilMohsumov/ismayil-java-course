package org.example.lesson6.ismayil;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        String reversedString = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string:"); //Salam
        String userInput = sc.nextLine();
        int index = userInput.length()-1;

//        while (index > 0){
//            index--;
//            reversedString = reversedString + userInput.charAt(index);
//        }
//        System.out.println(reversedString.toUpperCase());

        for (;index >= 0;index--){
            reversedString = reversedString + userInput.charAt(index);

        }
        System.out.println(reversedString.toUpperCase());


    }
}

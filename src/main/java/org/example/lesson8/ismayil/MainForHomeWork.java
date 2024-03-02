package org.example.lesson8.ismayil;

import java.util.Scanner;

public class MainForHomeWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter email:");
        String input = sc.next();
        int counter = 0;


        Boolean isValid = AuthCheck.checkIfLoginIsValid(input); //mahammad -> false

        while (!isValid){ //
            System.err.println("Please enter gmail.com:"); // cuma , cuma@gmail.com
            Boolean secondInputIsValid = AuthCheck.checkIfLoginIsValid(sc.nextLine());
            if (secondInputIsValid){
                isValid=true;
            }
            counter ++;
            if (counter == 5){
                System.out.println("Bes shansiviz var idi");
                System.exit(0);
            }


        }





    }
}

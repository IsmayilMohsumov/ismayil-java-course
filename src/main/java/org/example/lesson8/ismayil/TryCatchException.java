package org.example.lesson8.ismayil;

import java.util.Scanner;

public class TryCatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("enter your id (only integer):");
            Integer inputId = sc.nextInt();
            System.out.println("enter your id (only integer):");
            String input = sc.next();
            int counter = 0;

            Boolean isValid = AuthCheck.checkIfLoginIsValid(input); //mahammad -> false

            while (!isValid) { //
                System.err.println("Please enter gmail.com:"); // cuma , cuma@gmail.com
                Boolean secondInputIsValid = AuthCheck.checkIfLoginIsValid(sc.nextLine());
                if (secondInputIsValid) {
                    isValid = true;
                }
                counter++;
                if (counter == 5) {
                    System.out.println("Bes shansiviz var idi");
                    System.exit(0);
                }


            }
        }catch (Exception e){

        } finally {

        }


    }
}

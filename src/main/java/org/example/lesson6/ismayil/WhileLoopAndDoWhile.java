package org.example.lesson6.ismayil;

import java.util.Scanner;

public class WhileLoopAndDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu using do-while loop:");
            System.out.println("1. Print Hello");
            System.out.println("2. Print World");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Hello!");
            } else if (choice == 2) {
                System.out.println("World!");
            } else if (choice != 3) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        System.out.println("Program exited. Thank you!");
        scanner.close();
    }

    public void withWhile(){
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        // While loop example
        System.out.println("Menu using while loop:");
        while (choice != 3) {
            System.out.println("1. Print Hello");
            System.out.println("2. Print World");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Hello!");
            } else if (choice == 2) {
                System.out.println("World!");
            } else if (choice != 3) {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Program exited. Thank you!");
        scanner.close();
    }
}

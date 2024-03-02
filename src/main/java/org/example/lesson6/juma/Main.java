package org.example.lesson6.juma;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        AuthCheck authCheck = new AuthCheck();
        Scanner scanner = new Scanner(System.in);

        String LOGIN = "cumayev.c@gmail.com";
        String PASSWORD = "lesson6";

        System.out.println("""
                Menu:
                1. Login
                2. Register
                3. Use Services
                4. Exit
                Enter a number:""");



        int index = scanner.nextInt();
             while (index != 4)
        {
            switch (index) {
                case 1:
                    System.out.println("Enter your email: ");
                    String userInput = scanner.next();
                    System.out.println("Enter your password: ");
                    String userPassword = scanner.next();


                    System.out.println(authCheck.checkIfLoginIsValid(userInput));
                    if ((userInput.equals(LOGIN)) && (userPassword.equals(PASSWORD))) {
                        System.out.println("Welcome...");
                    } else {
                        System.out.println("Wrong....");
                    }
                    break;


                case 2:
                    System.out.println("Enter your email: ");
                    userInput = scanner.next();
                    System.out.println("Enter your password: ");
                    userPassword = scanner.next();

                    System.out.println(authCheck.checkIfLoginIsValid(userInput));
                    Boolean isValid = authCheck.checkIfLoginIsValid(userInput);
                    while(!isValid){
                        System.err.println("Please enter @gmail.com:");
                        userInput = scanner.next();
                        if (authCheck.checkIfLoginIsValid(userInput)){
                            isValid=true;
                        }
                    }
                    System.out.println(authCheck.encryptThePassword(userPassword));
                    User user = new User(userInput, userPassword);
                    System.out.println("User's login is : "+user.login);
                    System.out.println("User's password is : "+user.password);

                    break;
                case 3:
                    System.exit(0);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

            System.exit(0);
        }




    }
}

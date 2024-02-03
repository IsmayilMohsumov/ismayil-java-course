package org.example.lesson3.mahammad;

import java.util.Scanner;

public class AuthenticationSystem {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        RegisterChecker checker =new RegisterChecker();


        System.out.println("Login girin:" );
        String login = scanner.next();

        System.out.println("Password girin:" );
        String password =scanner.next();
        checker.enterPassword(login, password);
    }
}

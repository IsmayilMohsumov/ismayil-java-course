package org.example.lesson7.ismayil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User cuma = new User("cuma@gmail.com","cuma");

//        System.out.println("Welcome : " +
//                "\n 1. Login" +
//                "\n 2. Register " +
//                "\n 3. Use " +
//                "\n 4. Exit");

        System.out.println(AuthCheck.checkIfLoginIsValid(cuma.login));
        System.out.println(AuthCheck.encryptPassword(cuma.password));


    }
}

package org.example.lesson3.juma;

import java.util.Scanner;

//Homework 2:

    public class SimpleAuthentication {

    public static void main(String[] args) {

        SimpleAuthentication s = new SimpleAuthentication();
        s.login();






    }
    void login(){
        String login = "Juma";
        String password = "Juma0404";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String userLg = sc.next();
        System.out.println("Enter your password: ");
        String userPsw = sc.next();



        if((userLg.equals(login) ) && (userPsw.equals(password) )){
            System.out.println("Welcome....");

        } else if ( (userLg.equals(login))  ) {
            System.out.println("Incorrect password. Access denied.");

        } else if ( (userPsw.equals(password)) ){
            System.out.println("Incorrect username. Access denied.");

        } else {
            System.out.println("Incorrect login and password. Access denied.");
        }

    }






}


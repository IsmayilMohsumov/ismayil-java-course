package org.example.lesson2.ismayil;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Salam adiniz nedir?:");
        String adi = sc.next();

        System.out.println(c.salamUser(adi));

        System.out.print("Nece yasiniz var?");
        int yash = sc.nextInt();//11
        if (!c.checkIfAdult(yash)){
            System.exit(0);
        }


        System.out.println("Birinci ededi girin:");
        int birinci = sc.nextInt();
        System.out.println("Ikinci ededi girin:");
        int ikinci = sc.nextInt();

        System.out.println("toplama emeliyyatinin cavabi: " + c.toplama(birinci,ikinci));
        System.out.println(c.vurma(birinci,ikinci));
        System.out.println(c.cixma(birinci,ikinci));
        System.out.println(c.bolme(birinci,ikinci));

    }

    boolean checkIfAdult(int a){
        return a>=18;
    }
    int toplama(int a, int b){
        return a+b;
    }

    int cixma(int a, int b){
        return a-b;
    }

    String salamUser(String user){
        return "Salam " + user;

    }

    int vurma(int a, int b){
        return a*b;
    }

    int bolme(int a, int b){
        return a/b;
    }





}

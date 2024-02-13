package org.example.lesson3.juma;

import java.util.Scanner;


public class JumaHomework1 {
    public static void main(String[] args) {
        JumaHomework1 z = new JumaHomework1();
        z.restart();





    }
    void restart(){
        Scanner sc = new Scanner(System.in);
        JumaHomework1 j = new JumaHomework1();
        //Start
        System.out.println("Enter your score: ");
        int scoreOfTheStudent = sc.nextInt();
        j.score(scoreOfTheStudent);

    }
    void score(int x){
        Scanner sc = new Scanner(System.in);
        if (x>=70 && x <=100){
            System.out.println("Your grade is 'A'...");
            System.out.println("Do you want to continue??? ");
            System.out.println("Yes or No");
            String exit = sc.next();
            String w = "Yes";
            String z = "No";
            if (exit.equals(z)){
                System. exit(0);
            }else if (exit.equals(w)){
                restart();
            }
        } else if (x>= 50 && x<= 69) {
            System.out.println("Your grade is 'B'...");
            System.out.println("Do you want to continue??? ");
            System.out.println("Yes or No");
            String exit = sc.next();
            String w = "Yes";
            String z = "No";
            if (exit.equals(z)){
                System. exit(0);
            }else if (exit.equals(w)){
                restart();
            }
        } else if (x>=30 && x<= 49) {
            System.out.println("Your grade is 'C'... ");
            System.out.println("Do you want to continue??? ");
            System.out.println("Yes or No");
            String exit = sc.next();
            String w = "Yes";
            String z = "No";
            if (exit.equals(z)){
                System. exit(0);
            }else if (exit.equals(w)){
                restart();
            }
        }else if (x>=0 && x<= 29){
            System.out.println("Your grade is 'D'... ");
            System.out.println("Do you want to continue??? ");
            System.out.println("Yes or No");
            String exit = sc.next();
            String w = "Yes";
            String z = "No";
            if (exit.equals(z)){
                System. exit(0);
            }else if (exit.equals(w)){
                restart();
            }
        }else {
            System.err.println("Invalid input...");
            System.out.println("Do you want to continue??? ");
            System.out.println("Yes or No");
            String exit = sc.next();
            String w = "Yes";
            String z = "No";
            if (exit.equals(z)){
                System. exit(0);
            }else if (exit.equals(w)){
                restart();
            }
        }

    }

}

package org.example.lesson4.juma.homework;

import java.util.Scanner;

public class Calculator {



    public double num1;
    public double num2;
    private String calculatorName;

    public double add(double num1, double num2){

        return num1 + num2;
    }
    public double add(double num1,double num2,double num3){


        return num1 + num2 + num3;
    }

    public void compare(){
        System.out.println("Enter number 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        System.out.println("Enter number 2: ");
        num2 = sc.nextDouble();
        if(num1 > num2){
            System.out.println("Bigger number is "+num1);
        }else if(num2 > num1){
            System.out.println("Bigger number is "+num2);
        }else {
            System.out.println("They are the same");
        }

    }
}
    class CalculatorDemo{
    public static void main(String[] args) {
     Calculator Calculator = new Calculator();
     double three = Calculator.add(3.2, 3.5, 4.2);
        System.out.println(three);

     double two = Calculator.add(3.0, 5.3);
        System.out.println(two);

        Calculator.compare();
        Calculator.calculatorName = "String";
        //We need to change the calculatorName's access modifier to the other ones to be able to use it in the different classes.
        // These access modifiers can be: Public, Protected or Default.

    }
}

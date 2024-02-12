package org.example.lesson4.juma.homework;

import java.util.Scanner;
class CalculatorDemo{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double three = calculator.add(3.2, 3.5, 4.2);
        System.out.println(three);

        double two = calculator.add(3.0, 5.3);
        System.out.println(two);

        calculator.compare();

        //calculator.calculatorName = "String";
        //We need to change the calculatorName's access modifier to the other ones to be able to use it in the different classes.
        // These access modifiers can be: Public, Protected or Default.


    }


}

public class Calculator {


    public Calculator(){
     double num1 = 5;
     double num2 = 6;
    }
    public Calculator(int num2){
     num2 = 6;


    }

    private String calculatorName;

    public double add(double num1, double num2){

        return num1 + num2;
    }
    public double add(double num1,double num2,double num3){


        return num1 + num2 + num3;
    }

    public void compare(){
        System.out.println("Number 1 is:  ");





        System.out.println("Number 2 is : ");

        if(true){
            System.out.println("Bigger number is ");
        }else if(false){
            System.out.println("Bigger number is ");
        }else {
            System.out.println("They are the same");
        }

    }
}


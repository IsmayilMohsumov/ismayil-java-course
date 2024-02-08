package org.example.lesson4;

public class Calculator {
    public static void main(String[] args) {
        Calculator c =new Calculator();
        System.out.println(c.calculatorName1);
        System.out.println("First number: "+ c.num1);
        System.out.println("second number: "+ c.num2);
        System.out.println("third number: " + c.num3);
        System.out.println("The sum of first and second number: ");
        System.out.println(c.add(c.num1, c.num2));
        System.out.println("The sum of first, second and third number: ");
        System.out.println(c.add(c.num1, c.num2,c.num3));
        System.out.println("The compare of sum1 and sum2: ");
        c.compare(c.add(c.num1, c.num2), c.add(c.num1, c.num2, c.num3));

    }
    public double num1=4.0;
    public double num2=4.2;
    public double num3 =5.7;

    private   String  calculatorName1 = "Mahammad";



    public double add(double num1, double num2){
        double sum1= num1+num2;

        return sum1 ;
    }
    public double add (double num1,double num2,double num3){

        double sum2= num1+num2+num3;

        return sum2;

    }

    public void compare(double sum1, double sum2 ){

        if (sum1>sum2){

            System.out.println("sum1 is bigger than sum2");
        }
        else {

            System.out.println("sum2 is bigger than sum1");


        }
    }


}


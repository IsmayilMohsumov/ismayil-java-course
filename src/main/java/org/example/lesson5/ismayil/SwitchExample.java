package org.example.lesson5.ismayil;

public class SwitchExample {

    //        byte value = 2;
    //        char grade = 'B';
    //        int number = 3;
    //        String day = "Tuesday";
    //        enum -> Weekday weekday = Weekday.WEDNESDAY;

    public static void main(String[] args) {
        case2();
    }

    public static void case2(){
        int day = 9;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's weekday");
                break;
            case 6:
            case 7:
                System.out.println("It's weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    public void case3(){
        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            default:
                System.out.println("Weekday");
        }


    }


    public static void case1() {
        int month = 4;

        switch (month) {
            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Weekday");
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");

        }
    }
}

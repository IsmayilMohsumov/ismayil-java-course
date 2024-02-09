package org.example.lesson5.ismayil;

public class SwitchExample {

    //        byte value = 2;
    //        char grade = 'B';
    //        int number = 3;
    //        String day = "Tuesday";
    //        enum -> Weekday weekday = Weekday.WEDNESDAY;

    public static void main(String[] args) {
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
}

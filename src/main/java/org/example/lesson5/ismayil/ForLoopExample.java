package org.example.lesson5.ismayil;

public class ForLoopExample {

    public static void main(String[] args) {

        for (int i=0; i<0; i++){
            System.out.println("Hello");
        }

        int i = 1;
        for (; ; i++) {

            if (i > 5) {
                break;
            }
            System.out.println(i);
        }

        for (int a = 1; a <= 5; ) {
            System.out.println(a);
            a++;
        }

        for (int a = 1, d = 4; a <= 5; ) {
            System.out.println(a);
            a++;
            d++;
        }

        int c = 1;
        for (; c <= 5; ) {
            System.out.println(c);
            c++;
        }

        for ( ; ; ){
            System.out.println("Hello World");
        }

    }
}

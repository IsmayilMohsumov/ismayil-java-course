package org.example.lesson7.cuma;

public  final class Cuma extends Saleh {


    //Inheritance
    //Polymorphism
    Cuma(String name, String surname) {
        super(name, surname);
    }

    Cuma(){

    }

    @Override
    void print() {
        System.out.println("Menim adim Cumadir");
    }
}

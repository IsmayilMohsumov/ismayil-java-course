package org.example.lesson6.cuma;

public class Egret {
    private String color;

    public Egret() {

    }

    public Egret(String color) {

        this.color = color;
    }

    public static void main(String[] args) {
        Egret e = new Egret("White");
        System.out.println("Color:" + e.color);
    }
}
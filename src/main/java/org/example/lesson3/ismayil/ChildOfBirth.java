package org.example.lesson3.ismayil;

public class ChildOfBirth {
    public String name;
    public int age = 0;

    public ChildOfBirth(String name) {
        this.name = name;
    }

    public ChildOfBirth() {

    }

    public void printName() {
        System.out.println(this.name);
    }


    public void increment() {
        this.age += 1;
    }

}

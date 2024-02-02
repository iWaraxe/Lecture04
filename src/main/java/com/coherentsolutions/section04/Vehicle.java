package com.coherentsolutions.section04;

public class Vehicle {
    public void move() {
        System.out.println("The vehicle moves");
    }

    // Static Polymorphism through method overloading
    public void move(int speed) {
        System.out.println("The vehicle moves at " + speed + " mph");
    }
}

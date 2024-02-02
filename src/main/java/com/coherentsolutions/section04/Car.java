package com.coherentsolutions.section04;

public class Car extends Vehicle{
    // Dynamic Polymorphism through method overriding in the Car class
    @Override
    public void move() {
        System.out.println("The car drives");
    }

}

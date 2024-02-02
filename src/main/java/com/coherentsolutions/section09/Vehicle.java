package com.coherentsolutions.section09;

public abstract class Vehicle {
    public abstract void move();

    public void stop() {
        System.out.println("The vehicle has stopped");
    }
}
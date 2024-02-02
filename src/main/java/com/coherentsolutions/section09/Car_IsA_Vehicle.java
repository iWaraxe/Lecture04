package com.coherentsolutions.section09;

// Is-A relationship
public class Car_IsA_Vehicle  extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car drives");
    }
}

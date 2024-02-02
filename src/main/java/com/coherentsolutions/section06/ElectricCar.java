package com.coherentsolutions.section06;

public class ElectricCar extends Car {
    String batteryType;

    public ElectricCar(String batteryType) {
        super();  // Calls the parent class constructor
        this.batteryType = batteryType;
    }


    @Override
    public void move() {
        System.out.println("The electric car silently drives");
    }

    public void useSuperMove() {
        super.move();
    }
}

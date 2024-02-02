package com.coherentsolutions.section04;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle1 = new Car();
        myVehicle1.move();           // Output: "The car drives"
        myVehicle1.move(50);  // Output: "The vehicle moves at 50 mph"

        Vehicle myVehicle2 = new Vehicle();
        myVehicle2.move();              // Output: "The vehicle moves"
        myVehicle2.move(50);     // Output: "The vehicle moves at 50 mph"


    }
}

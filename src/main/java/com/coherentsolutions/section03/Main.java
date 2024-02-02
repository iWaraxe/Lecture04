package com.coherentsolutions.section03;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Boat myBoat = new Boat();
        Plane myPlane = new Plane();

        myCar.move();// Output: "The car drives"
        myBoat.move();  // Output: "The boat sails"
        myPlane.move(); // Output: "The plane flies"
    }
}

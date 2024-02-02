package com.coherentsolutions.section02;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.horn();
        myCar.move();  // Output will be "The vehicle moves"
        System.out.println(myCar.toString());;
    }
}

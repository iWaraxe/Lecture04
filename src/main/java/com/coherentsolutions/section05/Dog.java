package com.coherentsolutions.section05;

public class Dog extends Animal {
    public void printAnimalDetails() {
        // Accessing the protected member age from the superclass
        System.out.println("Animal age: " + age);

        // Cannot access the private member name directly
        // System.out.println("Animal name: " + name);  // This will cause a compile error
    }
}

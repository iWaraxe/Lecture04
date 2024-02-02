package com.coherentsolutions.section08;

// Abstract class
public abstract class Shape {
    public abstract void draw();
    public void erase() {
        System.out.println("Erasing shape");
    }
}
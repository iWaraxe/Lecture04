package com.coherentsolutions.section09;

// Has-A relationship
public class Car_HasA_Engine {
    private Engine engine;

    public Car_HasA_Engine() {
        engine = new Engine();
    }

    public void start() {
        engine.start();
    }
}
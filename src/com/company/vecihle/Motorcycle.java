package com.company.vecihle;

public class Motorcycle implements Vehicle {

    public void startEngine(boolean key) {
        if (key) {
            System.out.println("Motorcycle engine started!");
        } else {
            System.out.println("Insert key to start!");
        }
    }
    public void stopEngine() {
        System.out.println("Car engine stopped!");
    }

}

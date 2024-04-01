package org.example;

public class Bike implements Vechicle{

    private Tyre tyre;

    public void drive() {
        System.out.println("Bike with "+ tyre);
    }
}

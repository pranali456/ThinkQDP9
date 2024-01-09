package com.staticandfinal;

public class SuperCar {
	
	private int horsepower;
    private double fastestSpeed;

    // Constructor
    public SuperCar(int horsepower, double fastestSpeed) {
        this.horsepower = horsepower;
        this.fastestSpeed = fastestSpeed;
    }

    // Getter methods
    public int getHorsepower() {
        return horsepower;
    }

    public double getFastestSpeed() {
        return fastestSpeed;
    }


// cannot extend a final class
// class AnotherCar extends SuperCar {
}



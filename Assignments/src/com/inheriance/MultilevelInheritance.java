package com.inheriance;


class Vehicle1 {
    String type;

    Vehicle1(String type) {
        this.type = type;
        System.out.println("Vehicle constructor: " + type);
    }

    void start() {
        System.out.println("Vehicle is starting.");
    }
}


class Car1 extends Vehicle1 {
    Car1(String type) {
        super(type); 
        System.out.println("Car constructor");
    }

    void drive() {
        System.out.println("Car is driving.");
    }
}


class SportsCar extends Car1 {
    SportsCar(String type) {
        super(type); 
        System.out.println("SportsCar constructor");
    }

    void accelerate() {
        System.out.println("SportsCar is accelerating.");
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar("Convertible");
        mySportsCar.start();      
        mySportsCar.drive();      
        mySportsCar.accelerate(); 
    }


}



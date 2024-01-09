package com.inheriance;


class Vehicle3 {
    String type;

    Vehicle3(String type) {
        this.type = type;
        System.out.println("Vehicle constructor: " + type);
    }

    void start() {
        System.out.println("Vehicle is starting.");
    }
}


class Car3 extends Vehicle3 {
    Car3(String type) {
        super(type); 
        System.out.println("Car constructor");
    }

    void drive() {
        System.out.println("Car is driving.");
    }
}


class Motorcycle extends Vehicle3 {
    Motorcycle(String type) {
        super(type); 
        System.out.println("Motorcycle constructor");
    }

    void ride() {
        System.out.println("Motorcycle is riding.");
    }
}


public class Hierarchical {
    public static void main(String[] args) {
        Car3 myCar = new Car3("Sedan");
        myCar.start(); 
        myCar.drive(); 

        Motorcycle myMotorcycle = new Motorcycle("Sport");
        myMotorcycle.start(); 
        myMotorcycle.ride();  
    }
}





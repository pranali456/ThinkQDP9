package com.inheriance;

class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor: " + type);
    }

    void start() {
        System.out.println("Vehicle is starting.");
    }
}


class Car extends Vehicle {
    Car(String type) {
        super(type); 
        System.out.println("Car constructor");
    }

    void drive() {
        System.out.println("Car is driving.");
    }
}




public class SingleInheritance {

	public static void main(String[] args) {
		 Car myCar = new Car("Sedan");
	        myCar.start(); 
	        myCar.drive(); 
	    }
	}
		

	



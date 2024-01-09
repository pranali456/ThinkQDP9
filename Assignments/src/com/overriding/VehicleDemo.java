package com.overriding;

class Vehicle {
  String accelerate(long mph) {
    return "Vehicle is accelerating at " + mph + " mph";
 }


  String stop() {
    return "Vehicle is stopping";
 }


   String run() {
    return "Vehicle is running";
  }
}

class Car extends Vehicle {

String accelerate(long mph) {
    return "Car is accelerating at " + mph + " mph";
}
}

public class VehicleDemo {
public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    System.out.println(vehicle.accelerate(60));  
    System.out.println(vehicle.stop());           
    System.out.println(vehicle.run());            

    Car car = new Car();
    System.out.println(car.accelerate(80));     
    System.out.println(car.stop());               
    System.out.println(car.run());                
}
}
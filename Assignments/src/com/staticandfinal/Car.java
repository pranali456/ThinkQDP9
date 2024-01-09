package com.staticandfinal;

class Car{
	private String model;

   
    private static int totalCarSold;

    
    public Car(String model) {
        this.model = model;
        
        totalCarSold++;
    }

    
    public String getModel() {
        return model;
    }

  
    public static int getTotalCarSold() {
        return totalCarSold;
    }

    public static void main(String[] args) {
      
        Car.totalCarSold = 10;
        System.out.println("Total Cars Sold (changed by class name): " + Car.getTotalCarSold());

       
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        
        car1.totalCarSold = 20;

        
        System.out.println("Total Cars Sold : " + car2.getTotalCarSold());
    }
}
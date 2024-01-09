package com.overriding;

class Bike {

	String color;
	int speed;

	public Bike(String color, int speed) {

		this.color = color;
		this.speed = speed;
	}

	void bikeInfo() {
		System.out.println("Bike color: " + color);
		System.out.println("Bike speed: " + speed + " mph");

	}
}

class Pulsar extends Bike {
	public Pulsar(String color, int speed) {
		super(color, speed);
	}

	void bikeInfo() {
		System.out.println("Pulsar bike information:");
		System.out.println("Color: " + color);
		System.out.println("Speed: " + speed + " km/h");
	}
}

public class BikeDemo {

	public static void main(String[] args) {
		Bike b1 = new Bike("red", 60);
		b1.bikeInfo();
		
		Pulsar p1 = new Pulsar("grey", 70);
		p1.bikeInfo();
		
		

	}

}

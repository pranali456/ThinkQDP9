package com.staticandfinal;


class Bike{
	final void run() {                 // if we make method as private it cannot inherit in the child class
		System.out.println("running...");
	}
}

class Honda extends Bike{
	


   public static void main(String[] args) {
	new Honda().run();

	}
}


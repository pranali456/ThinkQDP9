package com.abstractAssignment;

abstract class Machine {
	abstract void crush();

	public void rotate() {
		System.out.println("machine is rotating");
	}

}

class Juicer extends Machine {

	@Override
	void crush() {
		System.out.println("juicer is crushing");

	}

	public void filter() {
		System.out.println("juicer is filtering");
	}

}

abstract class Mixer extends Machine {
	void crush() {
		System.out.println("juicer is crushing");

	}

	void blend() {
		System.out.println("blend the juice");
	}
}

public class JuicerDemo {

	public static void main(String[] args) {
		Machine m = new Juicer();
		m.crush();
		m.rotate();

		System.out.println("///////////////////////////////");

		Juicer j = new Juicer();
		j.crush();
		j.rotate();
		j.filter();
		
		System.out.println("////////////////////////////");

	//	Mixer p = new Mixer();  cannot allow to create object of abstarct class
		
		

	}

}

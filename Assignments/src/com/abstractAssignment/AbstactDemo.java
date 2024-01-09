package com.abstractAssignment;

abstract class Abs1 {
	abstract void doAbs1();
}

abstract class Abs2 {
	abstract void doAbs2();

}

class Temp extends Abs1 {

	@Override
	void doAbs1() {
		System.out.println("it is abstract class first");

	}

}

class Temp2 extends Abs2 {

	@Override
	void doAbs2() {
		System.out.println("it is abstract class second");

	}

}

public class AbstactDemo {

	public static void main(String[] args) {
		Temp t = new Temp();
		t.doAbs1();

		Temp2 t1 = new Temp2();
		t1.doAbs2();

	}

}

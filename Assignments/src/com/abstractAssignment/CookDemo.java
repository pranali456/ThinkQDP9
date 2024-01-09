package com.abstractAssignment;

abstract class Parent {

	abstract void cook();

	void wash() {
		System.out.println("washing dishes");
	}

}

class child extends Parent {

	@Override
	void cook() {
		System.out.println("cooking food");

	}

}

public class CookDemo {

	public static void main(String[] args) {
		child c = new child();

		c.cook();
		c.wash();

	}

}

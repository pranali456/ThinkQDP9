package com.abstractAssignment;

abstract class Parent1 {
	private String name;

	public Parent1(String name) {
		this.name = name;
		System.out.println("Parent constructor called with name: " + name);
	}

	abstract void cook();

	void wash() {
		System.out.println("Washing utensils...");
	}
}


class Child1 extends Parent1 {

	public Child1(String name) {

		super(name);
		System.out.println("Child constructor called");
	}

	void cook() {
		System.out.println("Cooking food...");
	}
}

public class SuperDemo {
	public static void main(String[] args) {

		Child1 child = new Child1("John");

		child.cook();

		child.wash();
	}
}

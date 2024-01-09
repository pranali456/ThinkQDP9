package com.Interface;

interface IceCream {
	abstract void eat();

	abstract void juice();

	abstract void drink();
}

class Mastani implements IceCream {

	@Override
	public void eat() {
		System.out.println("eat the ice-cream");

	}

	@Override
	public void juice() {
		System.out.println("drink juice");

	}

	@Override
	public void drink() {
		System.out.println("drink water");

	}

}

public class IceCreamDemo {

	public static void main(String[] args) {
		IceCream i = new Mastani();
		i.drink();
		i.eat();
		i.juice();

	}

}

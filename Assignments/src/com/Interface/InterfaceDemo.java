package com.Interface;

interface Cake {
	abstract void bake();
}

class Strawberry implements Cake {

	@Override
	public void bake() {
		System.out.println("bake the strawberry cake");

	}

}

class BlackForest implements Cake {

	@Override
	public void bake() {
		System.out.println("bake the blackforest cake");

	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Cake c = new Strawberry();
		c.bake();
		
		Cake c1 = new BlackForest();
		c1.bake();

	}

}

package com.abstractAssignment;

class Closet {
	String contents;

	public Closet() {
		super();

	}

	public Closet(String contents) {
		super();
		this.contents = contents;
	}

	public void display() {
		System.out.println("Closet contents updated to: " + contents);
	}

}

public class People {

	public static void main(String[] args) {
		
		System.out.println("people inside room only");
		
		Closet c = new Closet("shirt");
		Closet c1 = new Closet("pant");
		
		c.display();
		c1.display();

	}

}

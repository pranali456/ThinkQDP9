package com.staticandfinal;

public class AppleMobile {

	private final String color; // Using final to make the color is constant

	public AppleMobile() {
		this.color = "Space Grey";
	}

	public String getColor() {
		return color;
	}

	// cannot modify the final field once it is assigned
	// public void setColor(String newColor) {
	// this.color = newColor;
	// }

	public static void main(String[] args) {

		AppleMobile specialEditionPhone = new AppleMobile();

		System.out.println("Phone Color: " + specialEditionPhone.getColor());

		// cannot modify the final field once it is assigned
		// specialEditionPhone.setColor("New Color");

		System.out.println("Phone Color: " + specialEditionPhone.getColor());
	}
}

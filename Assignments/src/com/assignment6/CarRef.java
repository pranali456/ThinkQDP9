package com.assignment6;

public class CarRef {
	private String make;
	private String model;
	private int year;

	public CarRef(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void displayInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		CarRef c1 = new CarRef("Toyota", "camry", 2022);
		c1.make = "Honda";
		c1.model = "civic";
		c1.year = 2023;

		c1.displayInfo();
	}

}

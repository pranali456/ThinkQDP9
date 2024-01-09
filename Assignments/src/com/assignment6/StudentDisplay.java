package com.assignment6;

public class StudentDisplay {

	private int id;
	private String name;

	public StudentDisplay(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void displayData() {

		int newId = getId();

		this.id = newId;

		this.id = 123;
		this.name = "virat kohli";

		System.out.println("Changed values in displayData method:");
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
	}

	public void setCustomData(int customId, String customName) {

		this.id = customId;
		this.name = customName;
	}

	public static void main(String[] args) {

		StudentDisplay student = new StudentDisplay(101, "rahul");

		student.displayData();

		student.setCustomData(999, "Custom Student");

		System.out.println("Values after calling setCustomData method:");
		System.out.println("ID: " + student.id);
		System.out.println("Name: " + student.name);
	}
}
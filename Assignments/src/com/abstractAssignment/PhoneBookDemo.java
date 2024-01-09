package com.abstractAssignment;

class Phonebook {
	String personName;
	String contact;

	public Phonebook() {
		super();

	}

	public Phonebook(String personName, String contact) {
		super();
		this.personName = personName;
		this.contact = contact;
	}

	public void displayDetails() {
		System.out.println("Name: " + personName + ", Phone Number: " + contact);
	}

}

public class PhoneBookDemo {

	public static void main(String[] args) {
		Phonebook p = new Phonebook("pranali", "7028837950");
		
		p.displayDetails();

	}

}

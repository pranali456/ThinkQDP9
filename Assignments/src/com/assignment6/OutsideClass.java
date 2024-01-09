package com.assignment6;

class Person {
	private int id;
	private String name;

	public Person() {

	}

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}

public class OutsideClass {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId(2);
		p1.setName("siya");
		System.out.println(p1.getId());
		System.out.println(p1.getName());

		Person p2 = new Person(1, "piu");
		System.out.println(p2.getId());
		System.out.println(p2.getName());

	}

}

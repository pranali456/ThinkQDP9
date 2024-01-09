package com.containtment;

public class Person {

	private String name;
	private String gender;
	private int age;
	private Adress adress;

	public Person() {

	}

	public Person(String name, String gender, int age, Adress adress) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", adress=" + adress + "]";
	}
	

	

}

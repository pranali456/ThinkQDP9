package com.overriding;


class  Person{
	void readScript() {
		System.out.println("I am person");
	}
	
}
class Actor extends Person{
	void readScript() {
		System.out.println("I am actor");
	}
}


public class PersonDemo {
	public static void main(String[] args) {
		Person p= new Person();
		p.readScript();
		
		Actor a= new Actor();
		a.readScript();
		
	}

}

package com.containtment;

public class Location {

	public static void main(String[] args) {
		Adress a1= new Adress("pune", "maharastra", "India");
		Adress a2= new Adress("mumbai", "maharastra", "India");
		Adress a3= new Adress("sehore", "madhya pradesh", "India");
		
		
		Person p1= new Person("pranali", "female", 26, a1);
		Person p2= new Person("chaitali", "female", 26, a2);
		Person p3= new Person("shree", "male", 26, a1);
		Person p4= new Person("akansha", "female", 26, a3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		

	}

}

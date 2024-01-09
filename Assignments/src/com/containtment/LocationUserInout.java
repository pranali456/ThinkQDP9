package com.containtment;

import java.util.Scanner;

public class LocationUserInout {
	
	 static void enterPersonDetails(Person p) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter name");
		 p.setName(sc.next());
		 
		 System.out.println("Enter gender");
		 p.setGender(sc.next());
		 
		 System.out.println("Enter age");
		 p.setAge(sc.nextInt());
		 
		 p.setAdress(new Adress());
		 System.out.println("Enter adress");
		 
		 
		 System.out.println("Enter city");
		 p.getAdress().setCity(sc.next());
		
		 System.out.println("Enter state");
		 p.getAdress().setState(sc.next());
		 
		 System.out.println("enter country");
		 p.getAdress().setCountry(sc.next());
		 
		 System.out.println(p);
	 }

	public static void main(String[] args) {
		Person p1= new Person();
		Person p2= new Person();
		
		enterPersonDetails(p1);
		enterPersonDetails(p2);
	}
		

	

}

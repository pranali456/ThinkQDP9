package com.containtment;

public class College {

	public static void main(String[] args) {
	 Depart d1= new Depart(101, "It");
	 Depart d2= new Depart(102, "Mechanical");
	 Depart d3= new Depart(103, "Entc");
	 
	    Student s1= new Student(1, "pranali", d1);
		Student s2= new Student(2, "sona", d2);
		Student s3= new Student(3, "pranay", d3);
		Student s4= new Student(4, "prachi", d1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}

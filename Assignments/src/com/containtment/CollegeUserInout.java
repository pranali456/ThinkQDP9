package com.containtment;

import java.util.Scanner;

public class CollegeUserInout {
	
static Scanner sc= new Scanner(System.in);
	
	static void enterStudentDetails(Student s)
	{
		System.out.println("Enter the roll no");
		s.setRollNo(sc.nextInt());
		
		System.out.println("enter the name");
		s.setName(sc.next());
		
		s.setDept(new Depart());
		System.out.println("enter dept id");
		
		s.getDept().setDid(sc.nextInt());
		
		System.out.println("enter dept name");
		s.getDept().setDname(sc.next());
		
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		
		Student s1= new Student();
		Student s2= new Student();
		
		enterStudentDetails(s1);
		enterStudentDetails(s2);
		
		

	}

}

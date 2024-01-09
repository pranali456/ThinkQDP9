package com.exception2;

import java.util.Scanner;

public class ThrowExceptionDemo3 {
	static void throwException() {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter name");
	String name=sc.next();
	
	System.out.println("Enter marks");
	double marks=sc.nextDouble();
	
	
	
	if(marks<0|| marks>100) {
		throw new RuntimeException("marks should be between 0 and 100");}
		else
		{
			if(marks>40)
			{
				System.out.println(name +"has cleared the exam");
			}
			else
			{
				System.out.println(name+"has not cleared the exam");
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		throwException();
	}
		
	}



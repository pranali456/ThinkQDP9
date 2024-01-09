package com.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		sc.close();
		
		try {
		if(age<0)
			throw new InputMismatchException();
		
			System.out.println("you are"+age+"year old");
		}
		catch(InputMismatchException e) {
			System.out.println(e+"age cannot be negative");
	}

}


	}



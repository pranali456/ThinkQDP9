package com.CustomException;

import java.util.Scanner;

public class NameAccept {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		
		try {
		if(name.length()>3) {
			throw new InvalidNameException("name must be grater than 2 char");
		}
		}
		catch(Exception e) {
		System.out.println(e);

	}
		
		



	}
}

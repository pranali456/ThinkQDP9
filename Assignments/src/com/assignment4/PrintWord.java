package com.assignment4;

import java.util.Scanner;

public class PrintWord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int number= sc.nextInt();
		switch(number)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
			default:
				System.out.println("invalid number");
		}
	}

}

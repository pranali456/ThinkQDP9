package com.assignment4;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num1");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		
		System.out.println("Enter option");
		int option=sc.nextInt();
		switch(option) {
		case 1: 
		        if(num1>num2)
		        	System.out.println(num1 +": is greater");
		        else if(num2>num1) {
		        	System.out.println(num2 + ": is greater");
		        }
		        break;
		        default:
		        	System.out.println("invalid option");
		}
		
	}
}



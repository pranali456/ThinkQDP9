package com.assignment5;

import java.util.Scanner;

public class Power {
	public static int powerNumber(int b,int p) {
		int result=1;
		for(int i=1;i<=p;i++)
		{
			result*=b;
		}
		return result;
	
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		
		System.out.println("enter power");
		int power= sc.nextInt();
		
		System.out.println(powerNumber(base, power));

	}

}

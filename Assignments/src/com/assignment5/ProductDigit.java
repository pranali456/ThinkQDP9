package com.assignment5;

import java.util.Scanner;

public class ProductDigit {
	
	public static int calProduct(int num) {
		int prod=1;
		
		while(num!=0) {
			int digit=num%10;
			prod*=digit;
			num/=10;
		}
		return prod;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int product=calProduct(num);
		System.out.println("product of digit" +product);
		

	}

}

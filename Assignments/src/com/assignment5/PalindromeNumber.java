package com.assignment5;

import java.util.Scanner;

public class PalindromeNumber {
	public static boolean checkPalindron(int num) {
		int orignal=num;
		int revNum=0;
		do
		{
			int rem=num%10;
			revNum=(revNum*10)+rem;
			num/=10;
		}while(num!=0);
		
		if(orignal==revNum)
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		if(checkPalindron(n))
			System.out.println(n + "is a palindrome number");
		else
			System.out.println(n + "is a palindrome number");
			
		
		

	}

}
